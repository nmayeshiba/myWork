package loops;
import java.util.Scanner;
public class SumOfMultiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your favorite number?");
		int favorite = input.nextInt();
		int multiply = 0;
		int total = 0;
		int counter = 0;
		for(counter = 0; counter <= 50; counter++)
		{
		multiply = favorite*counter;
		total = total + multiply;
		}
		System.out.println("The sum of " + favorite + "'s first 50 multiples is " + total + ".");
		input.close();
	}

}
