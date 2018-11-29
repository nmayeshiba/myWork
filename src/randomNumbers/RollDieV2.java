package randomNumbers;
import java.util.Random;
import java.util.Scanner;
public class RollDieV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		Scanner input = new Scanner(System.in);
		int sides = 6;
		int oneRolls = 0;
		int onePercent = oneRolls / sides;
		int twoRolls = 0;
		int threeRolls = 0;
		int fourRolls = 0;
		int fiveRolls = 0;
		int sixRolls = 0;
		sides = sides + 1;
		System.out.println("How many times should the die be rolled?");
		int rolls = input.nextInt();
		int die = 0;
		for(int counter = 1; counter <= rolls; counter++)
		{
		die = generator.nextInt(sides);	
		System.out.println("You rolled: " + die);
		if(die == 1)
			{
			oneRolls++;
			}
		if(die == 2)
			{
			twoRolls++;	
			}
		if(die == 3)
			{
			threeRolls++;
			}
		if(die == 4)
			{
			fourRolls++;
			}
		if(die == 5)
			{
			fiveRolls++;
			}
		if(die == 6)
			{
			sixRolls++;
			}
		}
		System.out.println("One was rolled " + oneRolls + " times.");
		System.out.println("Two was rolled " + twoRolls + " times.");
		System.out.println("Three was rolled " + threeRolls + " times.");
		System.out.println("Four was rolled " + fourRolls + " times.");
		System.out.println("Five was rolled " + fiveRolls + " times.");
		System.out.println("Six was rolled " + sixRolls + " times.");
		input.close();
	}

}
