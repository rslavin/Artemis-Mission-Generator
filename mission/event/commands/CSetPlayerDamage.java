package mission.event.commands;

import mission.event.Command;

public class CSetPlayerDamage extends Command {

	public CSetPlayerDamage(String system, float val, String from, int index) {
		super("set_player_grid_damage");
		
		put("systemType", system);
		put("value", val);
		put("countFrom", from);
		put("index", index);
	}
	
	/*
	 * 
	 * Have a helper stuff to construct this nicely...
	 * 
	 */
	
	public static MkValue beam() {
		return new MkValue("systemBeam");
	}
	
	public static MkValue torpedo() {
		return new MkValue("systemTorpedo");
	}
	
	public static MkValue tactical() {
		return new MkValue("systemTactical");
	}
	
	public static MkValue turning() {
		return new MkValue("systemTurning");
	}
	
	public static MkValue impulse() {
		return new MkValue("systemImpulse");
	}
	
	public static MkValue warp() {
		return new MkValue("systemWarp");
	}
	
	public static MkValue front() {
		return new MkValue("systemFrontShield");
	}
	
	public static MkValue back() {
		return new MkValue("systemBackShield");
	}
	
	public static class MkValue {
		
		private String system;
		
		private MkValue(String sys) {
			system = sys;
		}
		
		public MkFrom value(float f) {
			return new MkFrom(f);
		}
		
		public class MkFrom {
			
			private float value;

			public MkFrom(float f) {
				value = f;
			}
			
			public MkIndex fromLeft() {
				return new MkIndex("left");
			}
			
			public MkIndex fromTop() {
				return new MkIndex("top");
			}
			
			public MkIndex fromFront() {
				return new MkIndex("front");
			}
			
			public class MkIndex {
				
				private String from;

				public MkIndex(String string) {
					from = string;
				}
				
				public CSetPlayerDamage index(int index) {
					
					return new CSetPlayerDamage(system, value, from, index);
					
				}
				
			}
			
		}
		
	}

}
