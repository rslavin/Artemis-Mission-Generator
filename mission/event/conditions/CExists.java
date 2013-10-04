package mission.event.conditions;

import mission.Named;
import mission.event.Condition;

public class CExists extends Condition {

	public CExists(String name) {
		super("if_exists");
		
		put("name", name);
	}
	
	public CExists(Named name) {
		super("if_exists");
		
		put("name", name);
	}
	
}
