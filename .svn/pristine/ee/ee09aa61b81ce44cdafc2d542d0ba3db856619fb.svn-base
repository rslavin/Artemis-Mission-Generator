package mission.event.conditions;

import mission.event.Condition;

public class CObjectProperty extends Condition {

	
	public CObjectProperty(Object src, String prop, String cmp, Object val) {
		super("if_object_property");
		
		put("name1", src);
		put("name2", prop); // TODO check this, the doc says "name"
		put("cmp", cmp);
		put("value", val);
	}
	
}
