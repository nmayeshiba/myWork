package decisionStructures;
import java.util.Scanner;
import java.util.Random;
public class FindNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		int randomNum = generator.nextInt(100);
		int guess = 0;
		int tries = 1;
		String hint = "heck";
		do {
			System.out.println("Guess the number I picked. (It's between 0 and 100)");
			guess = input.nextInt();
			if(guess < 0 || guess > 100)
			{
			System.out.println("That's not between 0 and 100, idiot.");	
			} else {
			if(guess > randomNum) 
			{
				System.out.println("Wrong, that number was too high.");
				tries++;
			}
			if(guess < randomNum) 
			{
				System.out.println("Wrong, that number was too low.");
				tries++;
			}
			if(guess != randomNum)
			{
			if(tries == 5)
			{
			System.out.println("Do you want a hint? (Capitalize the first letter to make my life easier.)");
			hint = input.next();
				if(hint.equals("Yes"))
				{
				System.out.println("Your last number was " + Math.abs(guess - randomNum) + " away from my number.");	
				}
				if(hint.equals("/givenumber"))
				{
				System.out.println("Fine, but only because you asked so nicely. The number is " + randomNum + ".");	
				}
				if(hint.equals("No"))
				{ 
				System.out.println("Whatever you say...");	
				}
				
			}
			}
		}
		}while(guess != randomNum);
		System.out.println("You guessed it, the number was " + randomNum + ".");
		System.out.println("It took you " + tries + " tries to guess the number.");
		if(hint.equals("Yes")) 
		{
		System.out.println("You used your hint, what a chump.");
		} else 
			{
			System.out.println("You did not use your hint.");	
			}
		if(tries == 1)
		{
		System.out.println("You are a GOD.");	
		}
		if(tries < 5)
		{
		System.out.println("You're pretty good at this.");	
		}
		if(tries >= 5 && tries <= 10)
		{
		System.out.println("Meh, you're average.");
		}
		if(tries > 10)
		{
		System.out.println("Wow, you suck at this game.");	
		}
		if(hint.equals("/givenumber"))
		{
		System.out.println("Wow, you cheated!");	
		}
		input.close();
	}

}
