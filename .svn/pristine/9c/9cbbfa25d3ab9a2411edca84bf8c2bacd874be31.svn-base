package mission.event;

import java.util.HashMap;
import java.util.Map;

public abstract class Command implements WithAttributes {
	
	protected HashMap<String, Object> attr = new HashMap<String, Object>();
	
	private String tag;
	
	protected Command(String tag) {
		this.tag = tag;
	}
	
	public String getTag() {
		return tag;
	}
	
	protected void put(String obj, Object val) {
		attr.put(obj, val);
	}
	
	@Override
	public Map<String, Object> getAttributes() {
		return attr;
	}

}
