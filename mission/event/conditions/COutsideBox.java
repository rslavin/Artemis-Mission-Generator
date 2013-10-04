package mission.event.conditions;


public class COutsideBox extends CBox {

	public COutsideBox(Object n, int leastX, int leastZ, int mostX, int mostZ) {
		super("if_outside_box", n, leastX, leastZ, mostX, mostZ);
	}
	
}
