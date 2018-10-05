package mathOperators;
import java.util.Scanner;
public class PullPhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int areaCode = 0;
		int firstThreeNumbers = 0;
		int lastFourNumbers = 0;
		System.out.println("What is the area code?");
		areaCode = input.nextInt();
		System.out.println("What are the first three digits?");
		firstThreeNumbers = input.nextInt();
		System.out.println("What are the last four digits?");
		lastFourNumbers = input.nextInt();
		System.out.println("Your number is 1 (" + areaCode + ") " + firstThreeNumbers + "-" + lastFourNumbers + ".");
		input.close();
	}

}
