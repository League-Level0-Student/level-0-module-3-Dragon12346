
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		int random = new Random().nextInt(100 + 1);
		Robot rob = new Robot();
		rob.penDown();
		rob.setPenWidth(10);
		rob.setSpeed(100);
		rob.hide();
		//3. ask the user what color they would like the robot to draw
		for (int i = 0; i < 100; i++) {
		String c = JOptionPane.showInputDialog("What color?(Black,Blue)");
		//4. use an if/else statement to set the pen color that the user requested
		if (c.equals("black")) {
		rob.setPenColor(Color.BLACK);	
		rob.move(5);
		rob.turn(4);
		}
		if (c.equals("blue")) {
			rob.setPenColor(Color.BLUE);	
			rob.move(5);
			rob.turn(4);
			}
		else {rob.setPenColor(random, random, random);
		rob.move(5);
		rob.turn(4);
		}	
		}
        //5. if the user doesn’t enter anything, choose a random color

        //6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		
	    //1. make the robot draw a shape (this will take more than one line of code)


	}
}
