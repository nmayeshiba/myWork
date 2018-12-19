package arrays;
import java.util.Scanner;
public class TestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[]scores = new int[5];
		for(int counter = 0; counter < 5; counter++)
			{
			System.out.println("Test score:");
			scores[counter] = input.nextInt();
			}
		for(int counter = 4; counter >= 0; counter--)
		{
		System.out.println("Score: " + scores[counter] + "%");	
		}
		input.close();
	}

}
