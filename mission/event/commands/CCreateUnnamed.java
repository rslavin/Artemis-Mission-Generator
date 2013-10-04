package mission.event.commands;

import mission.event.Command;

public class CCreateUnnamed extends Command {

	public final static String NEBULA = "nebulas";
	public final static String ASTEROID = "asteroids";
	public final static String MINES = "mines";

	public CCreateUnnamed(String type, int count, int radius, int randomRange,
			int startX, int startY, int startZ, Integer endX, Integer endY,
			Integer endZ, int randomSeed, Integer startAngle, Integer endAngle) {
		super("create");
		
		put("type", type);
		put("count", count);
		put("radius", radius);
		put("randomRange", randomRange);
		put("startX", startX);
		put("startY", startY);
		put("startZ", startZ);
		
		if (endX != null) {
			put("endX", endX);
		}
		if (endY != null) {
			put("endY", endY);
		}
		if (endZ != null) {
			put("endZ", endZ);
		}
		
		put("randomSeed", randomSeed);
		
		if (startAngle != null) {
			put("startAngle", startAngle);
		}
		if (endAngle != null) {
			put("endAngle", endAngle);
		}
		
	}
	
	public static CCreateUnnamed line(String type, int count, int rndRange, int startX, int startY, int startZ, int endX, int endY, int endZ, int rndSeed) {
		return new CCreateUnnamed(type, count, 0, rndRange, startX, startY, startZ, endX, endY, endZ, rndSeed, null, null);
	}
	
	public static CCreateUnnamed circle(String type, int count, int rndRange, int startX, int startY, int startZ, int radius, int rndSeed) {
		return new CCreateUnnamed(type, count, radius, rndRange, startX, startY, startZ, null, null, null, rndSeed, null, null);
	}

	public static CCreateUnnamed arc(String type, int count, int rndRange, int startX, int startY, int startZ, int radius, int rndSeed, int startArc, int endArc) {
		return new CCreateUnnamed(type, count, radius, rndRange, startX, startY, startZ, null, null, null, rndSeed, startArc, endArc);
	}

	public static MkCommonVals nebula() {
		return new MkCommonVals(NEBULA);
	}

	public static MkCommonVals asteroids() {
		return new MkCommonVals(ASTEROID);
	}

	public static MkCommonVals mines() {
		return new MkCommonVals(MINES);
	}

	
	public static class MkCommonVals {
		
		private String type;

		public MkCommonVals(String s) {
			type = s;
		}
		
		public MkShape vals(int count, int rndRange, int rndSeed) {
			return new MkShape(count, rndRange, rndSeed);
		}
		
		public class MkShape {

			private final int count;
			private final int rndRange;
			private final int rndSeed;

			public MkShape(int count, int rndRange, int rndSeed) {
				this.count = count;
				this.rndRange = rndRange;
				this.rndSeed = rndSeed;
			}
			
			public CCreateUnnamed line(int sX, int sY, int sZ, int eX, int eY, int eZ) {
				return CCreateUnnamed.line(type, count, rndRange, sX, sY, sZ, eX, eY, eZ, rndSeed);
			}
			
			public CCreateUnnamed circle(int cX, int cY, int cZ, int radius) {
				return CCreateUnnamed.circle(type, count, rndRange, cX, cY, cZ, radius, rndSeed);
			}
			
			public CCreateUnnamed arc(int cX, int cY, int cZ, int radius, int startArc, int endArc) {
				return CCreateUnnamed.arc(type, count, rndRange, cX, cY, cZ, radius, rndSeed, startArc, endArc);
			}
			
		}
		
	}
}
