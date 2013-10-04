package mission.event.conditions;

import mission.Variable;
import mission.event.Condition;

public class CVariable extends Condition {

	public CVariable(Variable var, String cmp, Object val) {
		
		super("if_variable");
		
		put("name", var);
		put("comparator", cmp);
		put("value", val);
	}
	
}
