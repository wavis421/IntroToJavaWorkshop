package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class PentagonCrazy {

	private void makePrettyThings() {

		Robot myRobot = new Robot("batman");
		myRobot.penDown();
		myRobot.setSpeed(10);

		// 9. Set the pen to a color that you like for the shape

		int sides = 8;
		int angle = 360/sides;
		
		// 7. Do steps #2 to #11, 200 times. When this is done you should see a pentagon.
		for (int i=0; i < 200; i++) {
			myRobot.move(i);
			myRobot.turn(angle);
			myRobot.turn(1);
			myRobot.setRandomPenColor();
		}
	}

	public static void main(String[] args) {
		new PentagonCrazy().makePrettyThings();
	}
}