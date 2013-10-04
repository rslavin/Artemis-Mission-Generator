package mission.event.commands;

import mission.Named;
import mission.event.Command;
import mission.expression.Expression;

public class CSetRelPos extends Command {

	private CSetRelPos(Named n1, Named n2) {
		super("set_relative_position");
		
		put("name1", n1);
		put("name2", n2);
	}
	
	public CSetRelPos(Named n1, Named n2, int angle, int dist) {
		this(n1, n2);
		
		put("angle", angle);
		put("distance", dist);
	}

	public CSetRelPos(Named n1, Named n2, Expression angle, Expression dist) {
		this(n1, n2);
		
		put("angle", angle);
		put("distance", dist);
	}

	
}
