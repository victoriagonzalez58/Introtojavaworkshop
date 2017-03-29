package day3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	public static void main(String[] args) {

		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested river,\n here's how to do it...");
		// Get the user to enter an adjective
String x =  JOptionPane.showInputDialog(null, "Enter an Adjective");

		// Get the user to enter a type of liquid
String y = JOptionPane.showInputDialog(null, "Enter a type of liquid");
		// Get the user to enter a body part
String z = JOptionPane.showInputDialog(null, "Enter a body part");
		// Get the user to enter a verb
String v = JOptionPane.showInputDialog(null, "Enter a verb");
		// Get the user to enter a place
String p = JOptionPane.showInputDialog(null, "Enter a Place");
		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		
		// Make a pop-up for the final story. You can use \n to go to the next line.
String story= "Piranhas are more " + x +" during the\n" +
		"day, so cross the river at night.\n"+
		" Piranhas are attracted to fresh\n" + y + 
		"and will most likely take a bite out of your\n" + z + 
		" if you "+ v + "." + "Whatever you do, if you have an open wound,\n "+
		"try to find another way to get back to the \n" + p + ". Good Luck!"; 
// Piranhas are more [adjective] during the day, so cross the river at
// night. Piranhas are attracted to fresh [type of liquid] and will most
// likely take a bite out of your [body part] if you [verb]. Whatever
// you do, if you have an open wound, try to find another way to get
// back to the [place]. Good luck!
JOptionPane.showInputDialog(null, story);

	}
}

