package decisionStructures;
import java.util.Scanner;
public class Honors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String grade = "test";
		System.out.println("What is your GPA?");
		double gpa = input.nextDouble();
		System.out.println("What is your class?");
		grade = input.next();
		if(grade.equals("Senior") && gpa >= 3.5)
		{	
		System.out.println("You graduate with honors.");
		} 
		else
		{
		System.out.println("You're not graduating yet.");	
		}
		
		input.close();
	}

}
