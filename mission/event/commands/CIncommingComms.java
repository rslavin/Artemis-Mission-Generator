package mission.event.commands;

import mission.event.Command;
import mission.event.WithBody;

public class CIncommingComms extends Command implements WithBody {

	private String text;
	
	public CIncommingComms(String from, String text) {
		super("incoming_comms_text");
		
		this.text = text;
	}

	@Override
	public String getBody() {
		return text;
	}

}
