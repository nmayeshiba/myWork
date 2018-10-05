package mathOperators;
import java.util.Scanner;
public class TakeATrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double distance = 0;
		double milesPerGallon = 0;
		double gasMoney = 0;
		double gallonsOfGas = 0;
		double costPerGallon = 0;
		System.out.println("How far are you traveling? (In miles)");
		distance = input.nextDouble();
		System.out.println("What is the car's MPG?");
		milesPerGallon = input.nextDouble();
		System.out.println("How much money did you spend on gas?");
		gasMoney = input.nextDouble();
		gallonsOfGas = distance / milesPerGallon;
		costPerGallon = gasMoney / gallonsOfGas;
		System.out.println("Total distance traveled: " +distance + " miles.");
		System.out.println("Gallons of gas used: " +gallonsOfGas);
		System.out.println("Money spent on gas: $" +gasMoney);
		System.out.println("Average cost per gallon: $" +costPerGallon);
		input.close();
		
	}

}
