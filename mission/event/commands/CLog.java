package mission.event.commands;

import mission.event.Command;

public class CLog extends Command {

	public CLog(String text) {
		super("log");
		
		put("text", text);
	}

}
