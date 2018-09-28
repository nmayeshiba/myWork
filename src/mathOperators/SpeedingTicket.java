package mathOperators;
import java.util.Scanner;
public class SpeedingTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int speedLimit = 0;
		int driverSpeed = 0;
		int speedOver = 0;
		final int fine = 55;
		final int extraCharge = 40;
		int ticket = 0;
		System.out.println("What is the speed limit here?");
		speedLimit = input.nextInt();
		System.out.println("What was the driver's speed?");
		driverSpeed = input.nextInt();
		speedOver = driverSpeed-speedLimit;
		ticket = (speedOver - 1)*(extraCharge) + fine;
		System.out.println("Speed limit: " +speedLimit);
		System.out.println("Driver Speed: " +driverSpeed);
		System.out.println("Cost of the ticket: $" +ticket);
		input.close();
	}

}
