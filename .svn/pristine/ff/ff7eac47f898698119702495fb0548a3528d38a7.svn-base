package mission.event.conditions;

import mission.event.Condition;

public class CDistance extends Condition {

	public CDistance(Object n1, Object n2, String cmp, Object val) {
		super("is_distance");
		
		put("name1", n1);
		put("name2", n2);
		put("comparator", cmp);
		put("value", val);
	}
	
	public CDistance(Object n1, int pointX, int pointY, int pointZ, String cmp, Object val) {
		super("is_distance");
		
		put("name1", n1);
		put("pointX", pointX);
		put("pointY", pointY);
		put("pointZ", pointZ);
		put("comparator", cmp);
		put("value", val);
	}

}
