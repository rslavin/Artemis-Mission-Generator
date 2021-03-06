package mission.event.commands;

import mission.Variable;
import mission.event.Command;
import mission.expression.Expression;

public class CSetVariable extends Command {

	public CSetVariable(Variable v, Expression e) {
		super("set_variable");
		
		put("name", v);
		put("value", e);
	}
	
	public CSetVariable(Variable v, int e) {
		super("set_variable");
		
		put("name", v);
		put("value", e);
	}
	
	public CSetVariable(Variable v, int iLow, int iHigh) {
		super("set_variable");
		
		put("name", v);
		put("randomIntLow", iLow);
		put("randomIntHigh", iHigh);
	}
	
	public CSetVariable(Variable v, float fLow, float fHigh) {
		super("set_variable");
		
		put("name", v);
		put("randomFloatLow", fLow);
		put("randomFloatHigh", fHigh);
	}


}
