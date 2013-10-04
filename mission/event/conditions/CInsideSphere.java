package mission.event.conditions;


public class CInsideSphere extends CSphere {

	public CInsideSphere(Object n, int centerX, int centerY,
			int centerZ, int radius) {
		super("if_inside_sphere", n, centerX, centerY, centerZ, radius);
	}
	
}
