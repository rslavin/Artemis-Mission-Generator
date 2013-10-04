package mission.event.conditions;

import mission.Named;
import mission.event.Condition;

public class CNotExists extends Condition {

	public CNotExists(String name) {
		super("if_not_exists");
		
		put("name", name);
	}
	
	public CNotExists(Named name) {
		super("if_not_exists");
		
		put("name", name);
	}
	
}
