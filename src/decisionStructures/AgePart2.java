package decisionStructures;
import java.util.Scanner;
public class AgePart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What's your name?");
		String name = input.nextLine();
		int num = 0;
		System.out.println("What could possibly be your age?");
		int age = input.nextInt();
		if(age >= 18) 
		{
		System.out.println("Have fun being charged as an adult, " + name + "!");
		} else
			{
			System.out.println("We don't charge children.");
			}
		System.out.println("Have a nice day.");
		do {
		System.out.println("9999 to quit");
		num = input.nextInt();
		}while(num != 9999);
		input.close();
	}

}
