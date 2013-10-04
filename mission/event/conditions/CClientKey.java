package mission.event.conditions;

import mission.event.Condition;

public class CClientKey extends Condition {

	public CClientKey(char key) {
		super("if_client_key");
		
		put("keyText", Character.toUpperCase(key));
	}
	
	public CClientKey(int scancode) {
		super("if_client_key");
		
		put("value", scancode);
	}

}
