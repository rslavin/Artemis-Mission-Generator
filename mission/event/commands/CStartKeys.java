package mission.event.commands;

import mission.event.Command;

public class CStartKeys extends Command {

	public CStartKeys(String consoles) {
		super("start_getting_keypresses_from");
		
		put("consoles", consoles);
	}
	
	public static CStartKeys fromHelm() {
		return new CStartKeys("H");
	}
	
	public static CStartKeys fromWeapons() {
		return new CStartKeys("W");
	}
	
	public static CStartKeys fromEngineering() {
		return new CStartKeys("E");
	}
	
	public static CStartKeys fromScience() {
		return new CStartKeys("S");
	}
	
	public static CStartKeys fromComm() {
		return new CStartKeys("C");
	}

}
