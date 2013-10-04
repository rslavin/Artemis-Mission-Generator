package mission;

import java.util.LinkedList;
import java.util.List;

import mission.event.Command;
import mission.event.Event;
import mission.event.Timer;

/**
 * A story collects the low-level data of a small mission
 * @author agampe
 *
 */
public class Story {

	protected List<Timer> startTimers = new LinkedList<Timer>();
	protected List<Command> startCommands = new LinkedList<Command>();
	protected List<Event> events = new LinkedList<Event>();

	public List<Timer> getStartTimers() {
		return startTimers;
	}
	
	public void addStartTimer(Timer t) {
		startTimers.add(t);
	}
	
	public List<Command> getStartCommands() {
		return startCommands;
	}
	
	public void addStartCommand(Command c) {
		startCommands.add(c);
	}
	
	public List<Event> getEvents() {
		return events;
	}
	
	public void addEvent(Event e) {
		events.add(e);
	}
	
}
