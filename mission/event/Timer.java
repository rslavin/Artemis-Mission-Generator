package mission.event;

import mission.AbstractNamed;

public class Timer extends AbstractNamed {

	private int time;

	public Timer() {
	}

	public Timer(int time) {
		this.time = time;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

}
