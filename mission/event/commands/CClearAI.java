package mission.event.commands;

import mission.event.Command;

public class CClearAI extends Command {

	public CClearAI(Object trg) {
		super("clear_ai");
		
		put("name", trg);
	}

}
