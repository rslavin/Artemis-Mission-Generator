package mission.event.commands;

import mission.event.Command;

public class CBigMessage extends Command {

	public CBigMessage(String title, String sub1, String sub2) {
		super("big_message");
		
		put("title", title);
		
		if (sub1 != null) {
			put("subtitle1", sub1);
			if (sub2 != null) {
				put("subtitle2", sub2);
			}
		}
	}

}
