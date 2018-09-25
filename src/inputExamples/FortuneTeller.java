package inputExamples;
import java.util.Scanner;
public class FortuneTeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Give me your weight!");
		double weight = input.nextDouble();
		System.out.println("Give me your age!");
		int age = input.nextInt();
		System.out.println("What could POSSIBLY be your lucky number?");
		int luckyNumber = input.nextInt();
		System.out.println("I see through your future...");
		System.out.println("You will die in " +luckyNumber + " years.");
		System.out.println("Your children will be born " +weight + age + " lbs.");
		System.out.println("At your local Walmart.");
	}

}
