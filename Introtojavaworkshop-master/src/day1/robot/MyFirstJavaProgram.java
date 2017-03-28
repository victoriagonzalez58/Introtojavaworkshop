package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
		Robot Bob = new Robot();
		Bob.setPenColor(Color.white);
		int sides = 360;

		Bob.penDown();
		Bob.setSpeed(50);
		for (int i = 0; i < sides; i++) {
			Bob.move(5);
			Bob.turn(360/sides);
		}
		

	
		
		
	}
}
