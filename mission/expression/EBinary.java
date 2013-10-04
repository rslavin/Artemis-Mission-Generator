package mission.expression;

public class EBinary extends Expression {

	private Expression left, right;
	private String op;

	public EBinary(String op, Expression left, Expression right) {
		this.left = left;
		this.right = right;
		this.op = op;
	}

	@Override
	public String toString() {
		return "(" + left.toString() + " " + op + " " + right.toString() + ")";
	}

}
