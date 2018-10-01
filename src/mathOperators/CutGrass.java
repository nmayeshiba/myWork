package mathOperators;
import java.util.Scanner;
public class CutGrass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double lawnLength = 0;
		double lawnWidth = 0;
		double fountainRadius = 0;
		double lawnArea = 0;
		double areaMowed = 0;
		double payment = 0;
		final double payRate = 1.25;
		System.out.println("What is the length of the lawn?");
		lawnLength = input.nextDouble();
		System.out.println("What is the width of the lawn?");
		lawnWidth = input.nextDouble();
		System.out.println("What is the radius of the fountain?");
		fountainRadius = input.nextDouble();
		lawnArea = (lawnLength * lawnWidth)*3 - fountainRadius;
		areaMowed = lawnArea / 100;
		payment = areaMowed * payRate;
		System.out.println("The area of the lawn is " + lawnArea +" feet.");
		System.out.println("You owe $" +payment +".");
		input.close();
		
	}

}
