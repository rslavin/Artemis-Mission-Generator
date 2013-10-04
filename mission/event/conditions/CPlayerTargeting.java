package mission.event.conditions;

import mission.Named;
import mission.event.Condition;

public class CPlayerTargeting extends Condition {

	public CPlayerTargeting(String name) {
		super("if_player_is_targeting");
		
		put("name", name);
	}
	
	public CPlayerTargeting(Named name) {
		super("if_player_is_targeting");
		
		put("name", name);
	}
	
}
