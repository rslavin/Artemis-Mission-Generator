package mission.event.conditions;

import objects.Station;
import mission.event.Condition;

public class CDocked extends Condition {

	public CDocked(Station s) {
		super("is_docked");
		
		put("name", s);
	}

}
