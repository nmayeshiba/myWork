package strings;
import java.util.Scanner;
public class SentenceToLowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence.");
		String sentence = input.nextLine();
		System.out.println("When you make the whole sentence lowercase, it looks like this: " + sentence.toLowerCase());
		System.out.println("Here's the regular sentence: " + sentence);
		input.close();
	}

}
