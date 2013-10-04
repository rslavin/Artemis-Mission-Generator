package mission.event.commands;

import mission.event.Command;

public class CIncommingMessage extends Command {

	/**
	 * 
	 * @param from
	 * @param fileName A file in the mission directory
	 * @param mediaType Media type is supposed to be "0" for OGG
	 */
	public CIncommingMessage(String from, String fileName, String mediaType) {
		super("incoming_message");
		
		put("from", from);
		put("fileName", fileName);
		put("mediaType", mediaType);
	}

}
