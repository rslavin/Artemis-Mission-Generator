package mission.event.commands;

import mission.event.Command;

public class CPlaySound extends Command {

	public CPlaySound(String file) {
		super("play_sound_now");
		
		put("filename", file);
	}

}
