package mission.event.commands;

import mission.Named;
import mission.event.Command;

public class CDestroy extends Command {

	public CDestroy(String name) {
		super("destroy");
		
		put("name", name);
	}

	public CDestroy(Named name) {
		super("destroy");
		
		put("name", name);
	}

	
}
