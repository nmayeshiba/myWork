package loops;
import java.util.Scanner;
public class ProductNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = 0;
		int product = 0;
		do {
		System.out.println("Enter a number (9999 to quit.)");
		num = input.nextInt();
		product = num*17;
		if(num != 9999) 
			{
			System.out.println("That number times 17 is " + product + ".");
			}
		} while(num != 9999);
		System.out.println("You ended the program.");
		input.close();
	}

}
