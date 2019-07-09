package de.tum.jk.behavioural.state.states;

import de.tum.jk.behavioural.state.robot.Robot;

public class Happy implements State {
	
	private Robot robot;
	
	public Happy(Robot robot) {
		this.robot = robot;
	}

	@Override
	public String punch() {
		//TODO handle state changes
		return null;
	}

	@Override
	public String hug() {
		//TODO handle state changes
		return null;
	}

	@Override
	public String insult() {
		//TODO handle state changes
		return null;
	}

}
