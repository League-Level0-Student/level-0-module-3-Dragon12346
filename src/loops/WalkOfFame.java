
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
		rob.setX(100);
		rob.penDown();
		rob.setSpeed(100);
		rob.hide();
		// 2. Make the robot draw a star shape. Hint: 144.
		for (int i = 0; i < 11; i++) {
		rob.move(30);
		rob.turn(144);
		}
		// 3. Set the size of the star to 30.

		

	}

}
