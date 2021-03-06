package mission;

import java.util.LinkedList;
import java.util.List;

import mission.event.Command;
import mission.event.Timer;
import mission.event.commands.CSetVariable;
import mission.expression.ENumber;
import mission.expression.Expression;



/**
 * Represents entire mission. This object is passed to WriteXML
 * This is a set of Stories
 * @author Rocky
 *
 */
public class Mission {
	public String rootString = "";
	public String version = "1a";
	public StartCondition startCond;
	public List<ImmediateEvent> immEvents;
	
	/**
	 * Stores all named objects so we can easily find them when preprocessing for names
	 */
	private List<Named> namedObjects = new LinkedList<Named>();

	/**
	 * Have special names for timers
	 */
	private int timerCount = 0;

	/**
	 * Have special names for timers
	 */
	private int varCount = 0;
	
	/**
	 * A list of all snippets.
	 */
	private List<Story> snippets = new LinkedList<Story>();
	
	/**
	 * Initializing commands. That was, I think, immEvents.
	 */
	private List<Command> startCommands = new LinkedList<Command>();
	
	private int nextFleet = 0;
	
	public Mission() {
		
	}
	
	public List<Named> getNamedObjects() {
		return namedObjects;
	}
	
	public void registerNamed(Named n) {
		namedObjects.add(n);
	}
	
	public List<Story> getSnippets() {
		return snippets;
	}
	
	public void addSnippet(Story s) {
		snippets.add(s);
	}
	
	public List<Command> getStartCommands() {
		return startCommands;
	}
	
	public void addStartCommand(Command c) {
		startCommands.add(c);
	}
	
	public Timer createTimer() {
		Timer t = new Timer();
		t.setId("timer"+(timerCount++));
		namedObjects.add(t);
		return t;
	}
	
	public Timer createTimer(int time) {
		Timer t = new Timer(time);
		t.setId("timer"+(timerCount++));
		namedObjects.add(t);
		return t;
	}
	
	public Variable createVariable() {
		Variable v = new Variable();
		v.setId("var"+(varCount++));
		namedObjects.add(v);
		return v;
	}
	
	public Variable createVariable(int val) {
		return createVariable(new ENumber(val));
	}
	
	public Variable createVariable(Expression e) {
		Variable v = createVariable();
		startCommands.add(new CSetVariable(v, e));
		return v;
	}
	
	public Variable createVariable(int low, int high) {
		Variable v = createVariable();
		startCommands.add(new CSetVariable(v, low, high));
		return v;
	}
	
	public int getNextFleet() {
		return nextFleet++;
	}

}
