package mission.snippets;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import mission.Mission;
import mission.Story;
import mission.Variable;
import mission.event.Command;
import mission.event.Condition;
import mission.event.Event;
import mission.event.Timer;
import mission.event.commands.CSetTimer;
import mission.event.commands.CSetVariable;
import mission.event.conditions.CTimerFinished;
import mission.event.conditions.CVariable;

/**
 * Generates a Story
 * @author agampe
 *
 */
public abstract class Template {

	protected Mission m;
	protected Story snippet;

	protected Template(Mission m) {
		this.m = m;
	}

	public Story make() {
		
		State entry = makeImpl();
		
		return makeStory(entry, getInitialTime());
	}

	protected abstract int getInitialTime();

	protected abstract State makeImpl();

	/*
	 * Some helper methods
	 */

	protected int createFleet(int cX, int cY, int cZ, int n, String race,
			String[] hulls, int[] chance) {
		int fleetNumber = m.getNextFleet();

		// TODO

		return fleetNumber;
	}

	/**
	 * Convert a state machine to events. Will create necessary state variable
	 * and timers.
	 * 
	 * @param entry
	 * @return
	 */
	protected Story makeStory(State entry, int initialDelay) {

		Story story = new Story();

		Variable storyState = m.createVariable(0);

		// set the initial timer
		Timer initTimer = m.createTimer(initialDelay);
		story.addStartTimer(initTimer);

		// walk the states, assigning them numbers
		// that's the number we'll set for the variable when we're done with the
		// state
		// also compute the predecessors (transition to a state)
		int curNr = 1;
		List<State> walk = new LinkedList<Template.State>();
		walk.add(entry);
		Map<State, Integer> stateNumbers = new HashMap<State, Integer>();
		Map<State, Set<State.Transition>> statePred = new HashMap<State, Set<State.Transition>>();
		List<State> stateOrdered = new LinkedList<State>();
		while (!walk.isEmpty()) {
			State st = walk.remove(0);
			if (!statePred.containsKey(st)) {
				statePred.put(st, new HashSet<State.Transition>());
			}
			if (stateNumbers.containsKey(st)) {
				continue;
			}
			stateNumbers.put(st, curNr++);
			stateOrdered.add(st);
			for (State.Transition t : st.out) {
				if (!statePred.containsKey(t.trg)) {
					statePred.put(t.trg, new HashSet<State.Transition>());
				}
				statePred.get(t.trg).add(t);
				walk.add(t.trg);
			}
		}

		// create timers as necessary
		Map<State.Transition, Timer> transTimer = new HashMap<Template.State.Transition, Timer>();
		for (State s : statePred.keySet()) {
			for (State.Transition t : statePred.get(s)) {
				if (t.timeout <= 0 || transTimer.containsKey(t)) {
					continue;
				}
				Timer ti = m.createTimer();
				transTimer.put(t, ti);
			}
		}

		// now "compile" each state to some events

		for (State st : stateOrdered) {

			if (statePred.get(st).isEmpty()) {
				// this is the entry node
				Event event = makeEvent(st);

				// initial conditions
				event.getConditions().add(0, new CTimerFinished(initTimer));
				event.getConditions().add(0, new CVariable(storyState, "=", 0));

				// change state var to value
				event.getCommands().add(
						new CSetVariable(storyState, stateNumbers.get(st)));

				// set up transition timers
				activateTransitionTimers(event, st, transTimer);
				
				story.addEvent(event);
			} else {

				// something regular
				// we're gonna clone the event for each incoming edge

				for (State.Transition inEdge : statePred.get(st)) {

					Event event = makeEvent(st);

					// active in state according to edge source
					event.getConditions().add(
							0,
							new CVariable(storyState, "=", stateNumbers
									.get(inEdge.getSrc())));
					// check if there's a timer involved
					if (inEdge.timeout > 0) {
						event.getConditions().add(0,
								new CTimerFinished(transTimer.get(inEdge)));
					}
					
					// change state var to value
					event.getCommands().add(
							new CSetVariable(storyState, stateNumbers.get(st)));
					
					// set up transition timers
					activateTransitionTimers(event, st, transTimer);
					
					story.addEvent(event);
				}

			}

		}
		
		return story;

	}

	private Event makeEvent(State st) {
		Event e = new Event();

		e.getCommands().addAll(st.cmd);
		e.getConditions().addAll(st.conds);

		return e;
	}

	private void activateTransitionTimers(Event ev, State st,
			Map<State.Transition, Timer> transTimer) {
		for (State.Transition t : st.out) {
			if (t.timeout > 0) {
				Timer ti = transTimer.get(t);
				ev.addCommand(new CSetTimer(ti, t.timeout));
			}
		}
	}

	public static class State {

		public class Transition {

			public State trg;

			// if > 0, means there should be a timeout transition
			public int timeout;
			
			protected Transition(State trg, int timeout) {
				this.trg = trg;
				this.timeout = timeout;
			}

			public State getSrc() {
				return State.this;
			}
		}

		public List<Transition> out = new LinkedList<Transition>();
		
		public void addTransition(State trg, int timeout) {
			out.add(new Transition(trg, timeout));
		}

		public List<Condition> conds = new LinkedList<Condition>();

		public List<Command> cmd = new LinkedList<Command>();

	}
}
