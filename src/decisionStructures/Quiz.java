package decisionStructures;
import java.util.Scanner;
public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What question do you want to start at?");
		int number = input.nextInt();
		int question1 = 0;
		switch(number)
		{
		case 1:
		System.out.println("How many days are in a week?");
		question1 = input.nextInt();
		if(question1 == 7)
		{
		number = 2;	
		}
		break;
		case 2:
		System.out.println("If you arrived here, you win.");
		break;
		
		}
		input.close();
	}

}
