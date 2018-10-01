package mathOperators;
import java.util.Scanner;
public class MoreCutGrass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double lawnLength = 0;
		double lawnWidth = 0;
		double lawnArea = 0;
		double mowerDeck = 0;
		double mowerSpeed = 0;
		final double payRate = 12;
		int time = 0;
		double totalPay = 0;
		System.out.println("What is the length of the lawn? (In feet)");
		lawnLength = input.nextDouble();
		System.out.println("What is the width of the lawn? (In feet)");
		lawnWidth = input.nextDouble();
		System.out.println("What is the size of the mower deck? (In inches)");
		mowerDeck = input.nextDouble();
		System.out.println("How fast is the mower? (MPH)");
		mowerSpeed = input.nextDouble();
		lawnArea = lawnLength*lawnWidth;
		time = (int)lawnArea / ((int)mowerDeck/12);
		totalPay = time * payRate;
		System.out.println("You owe $" +totalPay + " when the mower goes " + mowerSpeed + " MPH.");
		input.close();
		
		
	}

}
