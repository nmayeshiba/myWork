package inputExamples;
import java.util.Scanner;
public class LockerCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("First number of your combination!");
		int numberOne = input.nextInt();
		System.out.println("Second number of your combination!");
		int numberTwo = input.nextInt();
		System.out.println("Third number of your combination!");
		int numberThree = input.nextInt();
		System.out.println("I know your combination now!");
		System.out.println("It's " +numberOne + " - " +numberTwo + " - " + numberThree + "." );
		input.close();
	}

}
