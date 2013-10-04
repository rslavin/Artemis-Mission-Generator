package mission.event.commands;

import mission.event.Command;

public class CAddAI extends Command {

	public CAddAI(Object name, Object trg, String type, Object... val) {
		super("add_ai");
		
		put("name", name);
		
		if (trg != null) {
			put("targetName", trg);
		}
		
		put("type", type);
		
		if (val != null && val.length > 0) {
			for(int i=0;i<val.length;i++) {
				put("val"+(i+1), val[i]);
			}
		}
	}
	
	public static CAddAI becomeLeader(Object name) {
		return new CAddAI(name, null, "TRY_TO_BECOME_LEADER");
	}
	
	public static CAddAI chasePlayer(Object name, int dist, int nebDist) {
		return new CAddAI(name, null, "CHASE_PLAYER", dist, nebDist);
	}
	
	public static CAddAI chaseNeutral(Object name, int dist, int nebDist) {
		return new CAddAI(name, null, "CHASE_NEUTRAL", dist, nebDist);
	}
	
	public static CAddAI chaseEnemy(Object name, int dist, int nebDist) {
		return new CAddAI(name, null, "CHASE_ENEMY", dist, nebDist);
	}
	
	public static CAddAI chaseStation(Object name, int dist) {
		return new CAddAI(name, null, "CHASE_STATION", dist);
	}
	
	public static CAddAI chaseWhale(Object name, int dist) {
		return new CAddAI(name, null, "CHASE_WHALE", dist);
	}
	
	public static CAddAI avoidWhale(Object name, int dist) {
		return new CAddAI(name, null, "AVOID_WHALE", dist);
	}
	
	public static CAddAI avoidBlackHole(Object name, int dist) {
		return new CAddAI(name, null, "AVOID_BLACK_HOLE", dist);
	}
	
	public static CAddAI chaseAnger(Object name) {
		return new CAddAI(name, null, "CHASE_ANGER");
	}
	
	public static CAddAI chaseFleet(Object name, int dist) {
		return new CAddAI(name, null, "CHASE_FLEET", dist);
	}
	
	public static CAddAI followLeader(Object name) {
		return new CAddAI(name, null, "FOLLOW_LEADER");
	}
	
	public static CAddAI followComms(Object name) {
		return new CAddAI(name, null, "FOLLOW_COMMS_ORDERS");
	}
	
	public static CAddAI leaderLeads(Object name) {
		return new CAddAI(name, null, "LEADER_LEADS");
	}
	
	public static CAddAI elite(Object name) {
		return new CAddAI(name, null, "ELITE_AI");
	}
	
	public static CAddAI dirThrottle(Object name, int dir, int throttle) {
		return new CAddAI(name, null, "DIR_THROTTLE", dir, throttle);
	}
	
	public static CAddAI pointThrottle(Object name, int x, int y, int z, int throttle) {
		return new CAddAI(name, null, "POINT_THROTTLE", x, y, z, throttle);
	}
	
	public static CAddAI targetThrottle(Object name, Object trg, int throttle) {
		return new CAddAI(name, trg, "DIR_THROTTLE",  throttle);
	}
	
	public static CAddAI attack(Object name, Object trg, int throttle) {
		return new CAddAI(name, trg, "ATTACK",  throttle);
	}
	
	public static CAddAI defend(Object name, Object trg, int defender, int attacker) {
		return new CAddAI(name, trg, "DEFEND", defender, attacker);
	}
	
	public static CAddAI proceedExit(Object name) {
		return new CAddAI(name, null, "PROCEED_TO_EXIT");
	}
	
	public static CAddAI fighterBingo(Object name) {
		return new CAddAI(name, null, "FIGHTER_BINGO");
	}
	
	public static CAddAI launchFighters(Object name, int distToPlayer) {
		return new CAddAI(name, null, "LAUNCH_FIGHTERS", distToPlayer);
	}
	
}
