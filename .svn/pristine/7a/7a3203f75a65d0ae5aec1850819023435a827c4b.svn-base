package mission.event.commands;

import mission.event.Command;

public class CDirect extends Command {

	private CDirect(Object name, float throttle) {
		super("direct");
		
		put("name", name);
		put("scriptThrottle", throttle);
	}
	
	public CDirect(Object name, Object trg, float throttle) {
		this(name, throttle);
		
		put("targetName", trg);
	}

	public CDirect(Object name, int x, int y, int z, float throttle) {
		this(name, throttle);
		
		put("pointX", x);
		put("pointY", y);
		put("pointZ", z);
	}

}
