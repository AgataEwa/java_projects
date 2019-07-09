package de.tum.jk.behavioural.state;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import de.tum.jk.behavioural.state.robot.Robot;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Loading Robot friend");
		Robot robot = new Robot();
		System.out.println("Input commands: punch, hug, insult, exit");
		while(true) {
			String input = br.readLine();
			if(input.equals("punch")){
				robot.punch();
			}
			if(input.equals("hug")){
				robot.hug();
			}
			if(input.equals("insult")){
				robot.insult();
			}
			if(input.equals("exit")){
				System.out.println("Shutting down...");
				break;
			}
		}

	}

}
