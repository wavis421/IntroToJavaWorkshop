package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	Robot myRobot = new Robot();

	
	void go() {

		myRobot.setSpeed(10);

		int length = 50;

		for (int i = 0; i < 60; i++)
		{
			myRobot.setRandomPenColor();
	
			length += 6;

			drawTriangle (length);
	
			myRobot.turn(6);
		}
	}

	/* 2. fill in the method below to draw a triangle. Use the length variable for the size of the triangle. */
	private void drawTriangle(int length) {
		myRobot.penDown();
		for (int i = 0; i < 3; i++) {
			myRobot.move(length);
			myRobot.turn(360/3);
		}
		myRobot.penUp();	
	}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
