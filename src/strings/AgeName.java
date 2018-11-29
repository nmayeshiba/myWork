package strings;
import java.util.Scanner;
public class AgeName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your age?");
		int age = input.nextInt();
		input.nextLine();
		System.out.println("What is your full name?");
		String name = input.next();
		System.out.println("Your name is " + name + " and your age is " + age + ".");
		input.close();
	}

}
