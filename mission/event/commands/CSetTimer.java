package mission.event.commands;

import mission.event.Command;
import mission.event.Timer;

public class CSetTimer extends Command {

	public CSetTimer(Timer t) {
		super("set_timer");
		
		put("name", t);
		put("seconds", t.getTime());
	}

	public CSetTimer(Timer t, int seconds) {
		super("set_timer");
		
		put("name", t);
		put("seconds", seconds);
	}

	
}
