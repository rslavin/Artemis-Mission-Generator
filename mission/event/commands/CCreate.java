package mission.event.commands;

import mission.event.Command;

public class CCreate extends Command {

	/**
	 * Create a standard named object
	 * 
	 * @param name
	 * @param type
	 * @param x
	 * @param y
	 * @param z
	 * @param angle
	 * @param fleet
	 * @param race
	 * @param hull
	 */
	public CCreate(Object name, String type, Object x, Object y, Object z,
			Object angle, int fleet, String race, String hull) {
		super("create");

		put("name", name);
		put("type", type);
		put("x", x);
		put("y", y);
		put("z", z);
		put("angle", angle);
		
		if (!"player".equals(type)) {
			put("fleetnumber", fleet);
			put("raceKeys", race);
			put("hullKeys", hull);
		}
	}

	/**
	 * Create a mesh
	 * 
	 * @param name
	 * @param meshFile
	 * @param texFile
	 * @param fakeFront
	 * @param fakeBack
	 * @param red
	 * @param green
	 * @param blue
	 */
	public CCreate(Object name, Object x, Object y, Object z, String meshFile,
			String texFile, int fakeFront, int fakeBack, float red,
			float green, float blue) {
		super("create");
		
		put("name", name);
		put("type", "genericMesh");
		put("x", x);
		put("y", y);
		put("z", z);
		
		put("meshFileName", meshFile);
		put("textureFileName", texFile);
		
		put("fakeShieldsFront", fakeFront);
		put("fakeShieldsBack", fakeBack);
		
		put("ColorRed", red);
		put("ColorGreen", green);
		put("ColorBlue", blue);

	}

}
