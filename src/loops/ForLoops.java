package loops;
import java.util.Scanner;
public class ForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many hellos do you want?");
		int numberOfHellos = input.nextInt();
		while(numberOfHellos < 0)
		{
		if(numberOfHellos < 0)
			{
			System.out.println("A positive number, idiot.");
			}
		System.out.println("How many hellos do you want?");
		numberOfHellos = input.nextInt();
		}
		int counter = 0;
		for(counter = 0; counter<= numberOfHellos; counter++)
		{
		System.out.println(counter + " Hello");
		}
		System.out.println("You escaped the loop.");
		input.close();
	}

}
