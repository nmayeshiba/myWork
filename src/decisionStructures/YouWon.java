package decisionStructures;
import java.util.Scanner;
public class YouWon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double close = 0.1;
		System.out.println("How much money did you get for your 5th birthday?");
		double money = input.nextDouble();
		if(Math.abs(money - Math.sqrt(84.3)) < close )
		{
		System.out.println("You get $400 in pennies, congratulations!");	
		} else
			{
			System.out.println("You win 10 years in prison, congratulations!");
			}
		input.close();
	}

}
