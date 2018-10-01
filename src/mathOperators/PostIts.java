package mathOperators;
import java.util.Scanner;
public class PostIts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int postIts = 0;
		int postItsArea = 9;
		int rectangleLength = 0;
		int rectangleWidth = 0;
		System.out.println("What is the length of the rectangle?");
		rectangleLength = input.nextInt();
		System.out.println("What is the width of the rectangle?");
		rectangleWidth = input.nextInt();
		int rectangleArea = rectangleLength*rectangleWidth;
		postIts = rectangleArea / postItsArea;
		System.out.println("The area of the surface is " +rectangleArea + ".");
		System.out.println("It will take " +postIts+" Post-its to cover the surface.");
		

	}

}
