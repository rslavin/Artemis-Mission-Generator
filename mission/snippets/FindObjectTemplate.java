package mission.snippets;

import mission.Mission;
import mission.event.commands.CIncommingComms;
import mission.event.conditions.CInsideSphere;
import mission.event.conditions.COutsideSphere;

public class FindObjectTemplate extends Template {

	public FindObjectTemplate(Mission m) {
		super(m);
	}

	@Override
	protected int getInitialTime() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	protected State makeImpl() {
		
		// coordinates of the target
		
		int x = (int)(Math.random()*90000 + 5000);
		int y = 0;
		int z = (int)(Math.random()*90000 + 5000);
		
		State entry = new State();
		entry.cmd.add(new CIncommingComms("Admiral Ackbar", "Please help us find our lost teddy!"));
		
		State closer[] = new State[5];
		int rad[] = new int[]      {30000,  20000,   10000,    5000,         500};
		String cS[] = new String[] {"Far", "Close", "Closer", "Really Close", null};
		for(int i=0;i<5;i++) {
			State st = closer[i] = new State();
			
			// put some text
			if (cS[i] != null) {
				st.cmd.add(new CIncommingComms("Admiral Ackbar", "You are now "+cS[i]));
			}
			
			st.conds.add(new CInsideSphere("player", x, y, z, rad[i]));
			if (i+1 < rad.length) {
				st.conds.add(new COutsideSphere("player", x, y, z, rad[i+1]));
			}
			
		}
		
		// add the finishing text
		closer[closer.length-1].cmd.add(new CIncommingComms("Admiral Ackbar", "You have found it!"));
		
		// connect them
		entry.addTransition(closer[0], -1);
		for(int i=0;i<5;i++) {
			if (i>0 && i+1<rad.length) {
				// going away, except at the end
				closer[i].addTransition(closer[i-1], -1);
			}
			if (i+1 < rad.length) {
				// getting closer, not at the end
				closer[i].addTransition(closer[i+1], -1);
			}
		}
		
		return entry;
	}

}
