package mission.event.commands;

public abstract class PropHelper<T extends CModProperty> {

	public static PropHelper<CSetObjProperty> SET = new PropHelper<CSetObjProperty>() {

		@Override
		protected CSetObjProperty create() {
			return new CSetObjProperty();
		}
	};
	
	public static PropHelper<CAddToObjProperty> ADD = new PropHelper<CAddToObjProperty>() {

		@Override
		protected CAddToObjProperty create() {
			return new CAddToObjProperty();
		}
	};
	
	protected abstract T create();

	/*
	 * Generic properties
	 */

	public T posX(Object name, int x) {
		T t = create();
		t.init(name, "positionX", x);
		return t;
	}

	public T posY(Object name, int y) {
		T t = create();
		t.init(name, "positionY", y);
		return t;
	}

	public T posZ(Object name, int z) {
		T t = create();
		t.init(name, "positionZ", z);
		return t;
	}

	public T deltaX(Object name, int x) {
		T t = create();
		t.init(name, "deltaX", x);
		return t;
	}

	public T deltaY(Object name, int y) {
		T t = create();
		t.init(name, "deltaY", y);
		return t;
	}

	public T deltaZ(Object name, int z) {
		T t = create();
		t.init(name, "deltaZ", z);
		return t;
	}

	public T angle(Object name, float angle) {
		T t = create();
		t.init(name, "angle", angle);
		return t;
	}

	public T pitch(Object name, float angle) {
		T t = create();
		t.init(name, "pitch", angle);
		return t;
	}

	public T roll(Object name, float angle) {
		T t = create();
		t.init(name, "roll", angle);
		return t;
	}

	/*
	 * Stations
	 */

	public T shieldState(Object name, float f) {
		T t = create();
		t.init(name, "shieldState", f);
		return t;
	}

	public T canBuild(Object name, int i) {
		T t = create();
		t.init(name, "canBuild", i);
		return t;
	}

	public T baseHoming(Object name, int i) {
		T t = create();
		t.init(name, "missileStoresHoming", i);
		return t;
	}

	public T baseNuke(Object name, int i) {
		T t = create();
		t.init(name, "missileStoresNuke", i);
		return t;
	}

	public T basMine(Object name, int i) {
		T t = create();
		t.init(name, "missileStoresMine", i);
		return t;
	}

	public T baseEcm(Object name, int i) {
		T t = create();
		t.init(name, "missileStoresECM", i);
		return t;
	}

	/*
	 * ShieldedShips
	 */

	public T throttle(Object name, float f) {
		T t = create();
		t.init(name, "throttle", f);
		return t;
	}

	public T steering(Object name, float f) {
		T t = create();
		t.init(name, "steering", f);
		return t;
	}

	public T topSpeed(Object name, float f) {
		T t = create();
		t.init(name, "topSpeed", f);
		return t;
	}

	public T turnRate(Object name, float f) {
		T t = create();
		t.init(name, "turnRate", f);
		return t;
	}

	public T shieldFront(Object name, float f) {
		T t = create();
		t.init(name, "shieldStateFront", f);
		return t;
	}

	public T shieldFrontMax(Object name, float f) {
		T t = create();
		t.init(name, "shieldMaxStateFront", f);
		return t;
	}

	public T shieldBack(Object name, float f) {
		T t = create();
		t.init(name, "shieldStateBack", f);
		return t;
	}

	public T shieldBackMax(Object name, float f) {
		T t = create();
		t.init(name, "shieldMaxStateBack", f);
		return t;
	}

	public T triggerMines(Object name, int i) {
		T t = create();
		t.init(name, "triggersMines", i);
		return t;
	}

	public T damageBeam(Object name, float f) {
		T t = create();
		t.init(name, "systemDamageBeam", f);
		return t;
	}

	public T damageTorpedo(Object name, float f) {
		T t = create();
		t.init(name, "systemDamageTorpedo", f);
		return t;
	}

	public T damageTactical(Object name, float f) {
		T t = create();
		t.init(name, "systemDamageTactical", f);
		return t;
	}

	public T damageTurning(Object name, float f) {
		T t = create();
		t.init(name, "systemDamageTurning", f);
		return t;
	}

	public T damageImpulse(Object name, float f) {
		T t = create();
		t.init(name, "systemDamageImpulse", f);
		return t;
	}

	public T damageWarp(Object name, float f) {
		T t = create();
		t.init(name, "systemDamageWarp", f);
		return t;
	}

	public T damageFront(Object name, float f) {
		T t = create();
		t.init(name, "systemDamageFrontShield", f);
		return t;
	}

	public T damageBack(Object name, float f) {
		T t = create();
		t.init(name, "systemDamageBackShield", f);
		return t;
	}
	
	public T shield0(Object name, float f) {
		T t = create();
		t.init(name, "shieldBandStrength0", f);
		return t;
	}
	
	public T shield1(Object name, float f) {
		T t = create();
		t.init(name, "shieldBandStrength1", f);
		return t;
	}
	
	public T shield2(Object name, float f) {
		T t = create();
		t.init(name, "shieldBandStrength2", f);
		return t;
	}
	
	public T shield3(Object name, float f) {
		T t = create();
		t.init(name, "shieldBandStrength3", f);
		return t;
	}
	
	public T shield4(Object name, float f) {
		T t = create();
		t.init(name, "shieldBandStrength4", f);
		return t;
	}
	
	/*
	 * Enemies
	 */
	
	public T targetX(Object name, int i) {
		T t = create();
		t.init(name, "targetPointX", i);
		return t;
	}
	
	public T targetY(Object name, int i) {
		T t = create();
		t.init(name, "targetPointY", i);
		return t;
	}
	
	public T targetZ(Object name, int i) {
		T t = create();
		t.init(name, "targetPointZ", i);
		return t;
	}
	
	public T surrendered(Object name, int i) {
		T t = create();
		t.init(name, "hasSurrendered", i);
		return t;
	}
	
	/**
	 * 0: normal ship
	 * 1: follow fleet
	 * 2: ignore everything but players
	 * @param name
	 * @param i
	 * @return
	 */
	public T eliteAI(Object name, int i) {
		T t = create();
		t.init(name, "eliteAIType", i);
		return t;
	}
	
	public T eliteAbilityBits(Object name, boolean invis_main, boolean invis_sci, boolean invis_tac, boolean cloak, boolean het, boolean warp, boolean teleport) {
		
		int i = (invis_main ? 1 : 0) |
		        (invis_sci ? 2 : 0) |
		        (invis_tac ? 4 : 0) |
		        (cloak ? 8 : 0) |
		        (het ? 16 : 0) |
		        (warp ? 32 : 0) |
		        (teleport ? 64 : 0);
		
		T t = create();
		t.init(name, "eliteAbilityBits", i);
		return t;
		
	}
	
	public T eliteAbilityState(Object name, int i) {
		T t = create();
		t.init(name, "eliteAbilityState", i);
		return t;
	}
	
	public T surrenderChance(Object name, int i) {
		T t = create();
		t.init(name, "surrenderChance", i);
		return t;
	}
	
	/*
	 * Neutrals
	 */
	
	public T exitX(Object name, int i) {
		T t = create();
		t.init(name, "exitPointX", i);
		return t;
	}
	
	public T exitY(Object name, int i) {
		T t = create();
		t.init(name, "exitPointY", i);
		return t;
	}
	
	public T exitZ(Object name, int i) {
		T t = create();
		t.init(name, "exitPointZ", i);
		return t;
	}
	
	/*
	 * Players, using "player" for name, check for multi-bridge stuff
	 */
	
	public T playerHoming(int i) {
		T t = create();
		t.init("player", "countHoming", i);
		return t;
	}
	
	public T playerNuke(int i) {
		T t = create();
		t.init("player", "countNuke", i);
		return t;
	}
	
	public T playerMine(int i) {
		T t = create();
		t.init("player", "countMine", i);
		return t;
	}
	
	public T playerEcm(int i) {
		T t = create();
		t.init("player", "countECM", i);
		return t;
	}
	
	public T playerEnergy(int i) {
		T t = create();
		t.init("player", "energy", i);
		return t;
	}
	
	public T playerWarp(int i) {
		T t = create();
		t.init("player", "warpState", i);
		return t;
	}
	
	public T playerCoolant(int i) {
		T t = create();
		t.init("player", "totalCoolant", i);
		return t;
	}
	
}
