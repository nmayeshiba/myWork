package inputExamples;
import java.util.Scanner;
public class Vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Did you vote??????");
		boolean vote = input.nextBoolean();
		System.out.println("Wow, your voting value was " +vote +"? Congratulations.");
		input.close();
	}

}
