package decisionStructures;
import java.util.Scanner;
public class GradeCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your test average?");
		double testAverage = input.nextDouble();
		System.out.println("What is your homework average?");
		double homeworkAverage = input.nextDouble();
		System.out.println("Is your teacher nice? (Yes or No)");
		String nice = input.next();
		if(nice.equals("Yes"))
		{
			if(testAverage > homeworkAverage)
			{
			System.out.println("You received a " + testAverage + "% in the class.");
			} else
				{
				System.out.println("You received a " + homeworkAverage + "% in the class.");
				}
		}
		if(nice.equals("No"))
		{	
			if(testAverage < homeworkAverage)
			{
				System.out.println("You received a " + testAverage + "% in the class.");	
			} else 
				{
				System.out.println("You received a " + homeworkAverage + "% in the class.");
				}
		}
	    input.close();
	}
}
