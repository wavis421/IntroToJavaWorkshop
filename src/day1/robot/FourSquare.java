package day1.robot;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	Robot myRobot = new Robot();
	
	

	void go() {

		JOptionPane.showMessageDialog(null, "Started!");
		myRobot.setSpeed (10);
		myRobot.setPenWidth(5);

		// Draw four squares, each with a 90 degree turn
		for (int i = 0; i < 4; i++) {

			// Set the pen color to random
			myRobot.setRandomPenColor();
	
			drawSquare ();
	
			// Turn the robot 90 degrees to the right
			myRobot.turn (90);
		}

	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		
		//JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		myRobot.penDown ();
		for (int i = 0; i < 4; i++) {
			myRobot.move (100);
			myRobot.turn (360/4);
		}
		myRobot.penUp ();
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
