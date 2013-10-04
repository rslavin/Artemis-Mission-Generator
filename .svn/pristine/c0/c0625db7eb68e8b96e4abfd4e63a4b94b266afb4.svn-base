package mission.event.commands;

import mission.event.Command;

public class CDestroyNear extends Command {

	private CDestroyNear(String type, int radius) {
		super("destroy_near");
		
		put("type", type);
		put("radius", radius);
	}
	
	public CDestroyNear(String type, Object name, int radius) {
		this(type, radius);
		
		put("name", name);
		
		// wiki isn't clear if the center stuff is still necessary
		put("centerX", 0);
		put("centerY", 0);
		put("centerZ", 0);
	}
	
	public CDestroyNear(String type, int x, int y, int z, int radius) {
		this(type, radius);
		
		put("centerX", x);
		put("centerY", y);
		put("centerZ", z);
	}

}
