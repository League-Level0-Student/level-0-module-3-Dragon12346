
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String momsBirthday = "November 16th";
		String dadsBirthday = "April 9th";
		String myBirthday = "September 12th";

		// 2. Find out which birthday the user wants and and store their
		// response in a variable
		String B = JOptionPane.showInputDialog("Who's BDay do you want to know?");
		// 3. Print out what the user typed
		if (B.equals("moms")) {
			System.out.println(momsBirthday);

		}
		if (B.equals("my")) {
			System.out.println(myBirthday);

		}
		if (B.equals("dads")) {
			System.out.println(dadsBirthday);

		} else {
			JOptionPane.showMessageDialog(null, "Sorry, I don't know that persons BDay.");

		}
		// 4. if user asked for "mom"
		// print mom's birthday
		// 5. if user asked for "dad"
		// print dad's birthday
		// 6. if user asked for your name
		// print myBirthday
		// 7. otherwise print "Sorry, i don't remember that person's birthday!"

	}
}
