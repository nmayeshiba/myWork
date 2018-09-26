package inputExamples;
import java.util.Scanner;
public class AgeAndWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double weight = 12414214215.0;
		int firstAge = 17;
		System.out.println("What was your first age... Wait, what does that even mean?");
		firstAge = input.nextInt();
		System.out.println("How much do you weigh?");
		weight = input.nextDouble();
		System.out.println(weight + " is pretty hefty for someone that's " + firstAge +" years old...");
		input.close();
	}

}
