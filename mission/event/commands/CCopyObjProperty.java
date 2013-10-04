package mission.event.commands;

import mission.event.Command;

public class CCopyObjProperty extends Command {

	public CCopyObjProperty(Object n1, Object n2, String property) {
		super("copy_object_property");
		
		put("name1", n1);
		put("name2", n2);
		put("property", property);
	}

}
