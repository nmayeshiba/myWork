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
		do {
			System.out.println("Guess the number I picked. (It's between 0 and 100)");
			guess = input.nextInt();
			if(guess > randomNum) 
			{
				System.out.println("Wrong, that number was too high.");
			}
			if(guess < randomNum) 
			{
				System.out.println("Wrong, that number was too low.");	
			}	
		}while(guess != randomNum);
		System.out.println("You guessed it, the number was " + randomNum + ".");
		input.close();
	}

}
