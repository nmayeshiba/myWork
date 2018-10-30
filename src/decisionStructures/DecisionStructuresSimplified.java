package decisionStructures;
import java.util.Scanner;
public class DecisionStructuresSimplified {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int age = 18;
		System.out.println("What is your age?");
		age = input.nextInt();
		System.out.println(age==13);
		input.close();
	}

}
