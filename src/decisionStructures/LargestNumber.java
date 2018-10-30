package decisionStructures;
import java.util.Scanner;
public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number (9999 to quit.)");
		int num = input.nextInt();
		int large = 0;
		do {
		if (num > large)
		{
		large = num;	
		System.out.println("The new largest number is: " + num);
		}
		System.out.println("Enter a number (9999 to quit.)");
		num = input.nextInt();
		}while (num != 9999 || num == 30);
		System.out.println("The largest number in the end was " + large );
		input.close();
		for(int counter = 0; counter >= 7; counter++) {
			
		}
	}

}
