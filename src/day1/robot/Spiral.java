package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		Robot myRobot = new Robot();
		
		myRobot.penDown();

		myRobot.setSpeed(10);

		for (int i = 0; i < 75; i++) {

			myRobot.setRandomPenColor();
	
			myRobot.move(5*i);
	
			myRobot.turn(360/7);
	
			myRobot.setPenWidth(i);
		}

	}
}
