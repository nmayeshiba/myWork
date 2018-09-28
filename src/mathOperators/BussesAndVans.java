package mathOperators;
import java.util.Scanner;
public class BussesAndVans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final int busCapacity = 35;
		int busses = 0;
		int numberOfPeople = 0;
		int vans = 0;
		System.out.println("How many people need transportation?");
		numberOfPeople = input.nextInt();
		if (numberOfPeople < busCapacity)
		{
		vans = numberOfPeople;
		System.out.println("You don't have enough people for busses, so you need " + vans + " vans.");
		}
		vans = numberOfPeople / busCapacity;
		// This program is unfinished, don't forget to finish it.
		input.close();
	}

}
