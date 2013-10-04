package mission.event.conditions;

import mission.event.Condition;

public class CDamConMembers extends Condition {

	public CDamConMembers(int index, String cmp, Object val) {
		super("if_damcon_members");
		
		put("team_index", index);
		put("comparator", cmp);
		put("value", val);
	}

}
