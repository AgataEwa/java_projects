package de.tum.jk.behavioural.state.robot;

import de.tum.jk.behavioural.state.states.*;

public class Robot {

	private State state;
	public Angry angry;
	public Robot() {
		this.state = new Happy(this);
	}

	public void punch() {
		System.out.println(this.state.punch());
	}

	public void hug() {
		System.out.println(this.state.hug());
	}

	public void insult() {
		System.out.println(this.state.insult());
	}
	
	public void setState(State state){
		this.state = state;
	}

}
