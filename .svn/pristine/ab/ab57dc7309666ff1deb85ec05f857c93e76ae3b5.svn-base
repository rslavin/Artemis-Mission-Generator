package mission.event.conditions;

import mission.event.Condition;

public class CFleetCount extends Condition {

	// TODO check this, the wiki is weird!
	public CFleetCount(Object n, String cmp, Object val, int fleet) {
		this(n, cmp, val);

		put("fleetnumber", fleet);
	}

	public CFleetCount(Object n, String cmp, Object val) {
		super("if_fleet_count");

		if (n != null) {
			// TODO what's the name for?
			put("name", n);
		}
		
		put("comparator", cmp);
		put("value", val);
	}

}
