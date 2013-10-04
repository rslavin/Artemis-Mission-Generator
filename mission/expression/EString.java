package mission.expression;

public class EString extends Expression {

	private String s;
	
	public EString(String s) {
		this.s = s;
	}
	
	@Override
	public String toString() {
		return s;
	}

}
