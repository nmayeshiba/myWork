package loops;
import java.util.Scanner;
public class FiveNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int numberEntered = 0;
		int sum = 0;
		for(int counter = 1; counter <= 5; counter++)
		{
		System.out.println("Enter a number: ");
		numberEntered = input.nextInt();
		if(numberEntered % 2 == 0)
		{
		System.out.println(numberEntered + " is even.");	
		} else
			{
			System.out.println(numberEntered + " is odd.");
			}
		sum = sum + numberEntered;
		}
		System.out.println("The sum of the numbers entered is " + sum + ".");
		input.close();
	}

}
