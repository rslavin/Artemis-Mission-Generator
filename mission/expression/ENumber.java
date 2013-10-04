package mission.expression;

public class ENumber extends Expression {

	private Number n;
	
	public ENumber(int i) {
		n = i;
	}
	
	public ENumber(float f) {
		n = f;
	}
	
	@Override
	public String toString() {
		// TODO Float.toString() decimals?
		return n.toString();
	}

}
