package loops;
import java.util.Scanner;
public class HelloWorldNested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int bigcounter = 0;
		int counter = 0;
		int divisor = 0;
		System.out.println("Enter a number.");
		divisor = input.nextInt();
		for(bigcounter = 1; bigcounter <= 1; bigcounter++)
		{
		for(counter = 1; counter <= divisor; counter++)
		{
		if(divisor % counter == 0)
		{
		System.out.println("Divisors: " + counter);
		}
		}
		}
		input.close();
	}

}
