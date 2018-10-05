package mathOperators;
import java.util.Scanner;
public class PullSSN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		@SuppressWarnings("unused")
		int social = 0;
		@SuppressWarnings("unused")
		int social2 = 0;
		int age = 0;
		int yearsTo18 = 0;
		int lastFourDigits = 0;
		System.out.println("What is your age?");
		age = input.nextInt();
		System.out.println("What are the first 3 numbers of your SSN?");
		social = input.nextInt();
		System.out.println("The next two numbers?");
		social2 = input.nextInt();
		System.out.println("The last four numbers?");
		lastFourDigits = input.nextInt();
		yearsTo18 = 18 - age;
		System.out.println("In " + yearsTo18 + " years, you'll be 18.");
		System.out.println("Your social is *****" + lastFourDigits + ".");
		input.close();
	}

}
