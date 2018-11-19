package loops;

import java.util.Scanner;

public class FifthPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double num = 0;
		double power = 0;
		do {
		System.out.println("Enter a number (9999 to quit.)");
		num = input.nextInt();
		power = Math.pow(num,5);
		if(num != 9999) 
			{
			System.out.println("That number to the 5th power is " + power + ".");
			}
		} while(Math.abs(num - 9999) < 0.001);
		System.out.println("You ended the program.");
		input.close();
	}

}
