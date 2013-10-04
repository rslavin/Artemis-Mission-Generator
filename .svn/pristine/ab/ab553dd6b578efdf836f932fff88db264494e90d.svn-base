package mission.event.commands;

import mission.event.Command;

public class CSetFleetProperty extends Command {

	public CSetFleetProperty(int index, String property, float val) {
		super("set_fleet_property");
		
		put("fleetIndex", index);
		put("value", val);
		put("property", property);
	}
	
	public static CSetFleetProperty spacing(int index, float val) {
		return new CSetFleetProperty(index, "fleetSpacing", val);
	}
	
	public static CSetFleetProperty maxRadius(int index, float val) {
		return new CSetFleetProperty(index, "fleetMaxRadius", val);
	}

}
