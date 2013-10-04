package mission.event.commands;

import mission.event.Command;

public class CSetShipText extends Command {

	public CSetShipText(Object trg, String race, String cl, String desc, String scan_desc) {
		super("set_ship_text");
		
		if (race != null) {
			put("race", race);
		}
		
		if (cl != null) {
			put("class", cl);
		}
		
		if (desc != null) {
			put("desc", desc);
		}
		
		if (scan_desc != null) {
			put("scan_desc", scan_desc);
		}
	}
	
}
