package loops;
import java.util.Scanner;
public class WhileLoopsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How long should the loop go on for?");
		int lengthOfLoop = input.nextInt();
		int num = 0;
		while(num <= lengthOfLoop)
		{
		System.out.println(num);
		num = num + 2;
		}
		System.out.println("The program has concluded.");
		input.close();
	}

}
