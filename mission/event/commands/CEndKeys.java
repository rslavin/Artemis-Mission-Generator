package mission.event.commands;

import mission.event.Command;

public class CEndKeys extends Command {

	public CEndKeys(String consoles) {
		super("end_getting_keypresses_from");
		
		put("consoles", consoles);
	}
	
	public static CEndKeys fromHelm() {
		return new CEndKeys("H");
	}
	
	public static CEndKeys fromWeapons() {
		return new CEndKeys("W");
	}
	
	public static CEndKeys fromEngineering() {
		return new CEndKeys("E");
	}
	
	public static CEndKeys fromScience() {
		return new CEndKeys("S");
	}
	
	public static CEndKeys fromComm() {
		return new CEndKeys("C");
	}
	
}
