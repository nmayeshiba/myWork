package decisionStructures;
import java.util.Scanner;
public class DecisionStructures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Do you know what you're doing?");
		String decision = input.next();
		if(decision.equals("Yes")) 
		{
		System.out.println("Then get working, you nerd.");
		}
		if(decision.equals("No") )
		{
		System.out.println("Then pay attention, you nerd.");
		} else 
			{
			System.out.println("It's a yes or no question, diptwang.");
			}
		input.close();
	}

}
