package inputExamples;
import java.util.Scanner;
public class Monkey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is the height of an adult  M O N K E Y");
		int height = input.nextInt();
		System.out.println("So you're telling me a M O N K E Y is " +height +" inches tall?");
		boolean answer = input.nextBoolean();
		if(answer == true) 
		{
		System.out.println("You are a strange man");	
		} else 
			{
			System.out.println("oh.");
			}
	}

}
