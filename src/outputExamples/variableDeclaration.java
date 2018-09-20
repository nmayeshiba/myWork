package outputExamples;
import java.util.Scanner;
public class variableDeclaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int age = 17;
		double money = 15.75;
		boolean answer = false;
		
		System.out.println("What is your age nerd.");
		age = input.nextInt();
		System.out.println("What is amount money");
		money = input.nextDouble();
		System.out.println("Do you know the answer");
		answer = input.nextBoolean();
		System.out.println("So you're " + age + ", you have $" + money + ", and you think the answer is " + answer + "?");
	}

}
