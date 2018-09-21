package outputExamples;
import java.util.Scanner;
public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int age = 17;
		boolean answer = false;
		System.out.println("What is your age? 17?");
		age = input.nextInt();
		System.out.println("Oh, so you're "+ age + "?");
		answer = input.nextBoolean();
		if(answer == false) 
		{
			System.out.println("Then you're a liar.");
		} else
				{
				System.out.println("I thought so.");		
				}

	}

}
