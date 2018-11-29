package strings;
import java.util.Scanner;
public class Sentences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence.");
		String sentence = input.nextLine();
		System.out.println("The first letter is " + sentence.charAt(0));
		System.out.println("The third letter is " + sentence.charAt(2));
		System.out.println("You typed: " + sentence + ".");
		if(sentence.contains("Noah"))
		{
		System.out.println("Why did you mention Noah?");
		System.out.println("The sentence was: " + sentence + ".");
		}
		input.close();
	}

}
