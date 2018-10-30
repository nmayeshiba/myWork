package decisionStructures;
import java.util.Scanner;
public class LuckyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double weight = 0.0;
		double height = 0.0;
		System.out.println("Are you a kid or an adult?");
		String age = input.next();
		
		if(age.equals("kid")) 
		{
		System.out.println("What is your weight?");
		weight = input.nextDouble();
		System.out.println("Your lucky number is " + weight / 2.0 + ".");
		}
		if(age.equals("adult"))
		{
		System.out.println("What is your height?");
		height = input.nextDouble();
		System.out.println("Your lucky number is " + height * 5.0 + ".");
		}else 
			{
			System.out.println("Make sure what you typed was either kid or adult, not capitalized.");
			}
		input.close();
	}

}
