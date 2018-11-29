package randomNumbers;
import java.util.Random;
import java.util.Scanner;
public class RollDie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		Scanner input = new Scanner(System.in);
		System.out.println("How many sides does the die have?");
		int sides = input.nextInt();
		sides = sides + 1;
		System.out.println("How many times should the die be rolled?");
		int rolls = input.nextInt();
		int die = 0;
		for(int counter = 1; counter <= rolls; counter++)
		{
		die = generator.nextInt(sides);	
		System.out.println("You rolled a " + die + ".");
		}
		input.close();
	}

}
