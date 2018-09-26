package mathOperators;
import java.util.Scanner;
public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("WHAT is your age?");
		int age = input.nextInt();
		System.out.println("In 17,386 years, you'll be dead.");
		age = age + 10;
		System.out.println("However, in 10 years, you'll be " +age + " years old.");
		input.close();
	}

}
