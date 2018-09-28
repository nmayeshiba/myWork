package mathOperators;
import java.util.Scanner;
public class AverageTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final int numberOfTests = 3;
		int scoreOne = 0;
		int scoreTwo = 0;
		int scoreThree = 0;
		int testAverage = 0;
		System.out.println("First student's test score: ");
		scoreOne = input.nextInt();
		System.out.println("Second student's test score: ");
		scoreTwo = input.nextInt();
		System.out.println("Third student's test score: ");
		scoreThree = input.nextInt();
		testAverage = (scoreOne + scoreTwo + scoreThree) / numberOfTests;
		System.out.println("Test #1's Score: " + scoreOne + "%");
		System.out.println("Test #2's Score: " + scoreTwo + "%");
		System.out.println("Test #3's Score: " + scoreThree + "%");
		System.out.println("Test Average: " + testAverage + "%");
		input.close();
	}

}
