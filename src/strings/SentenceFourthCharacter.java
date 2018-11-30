package strings;
import java.util.Scanner;
public class SentenceFourthCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence.");
		String sentence = input.nextLine();
		int counter = 0;
		while(sentence.length() > counter)
		{
		System.out.println(sentence.charAt(counter));
		counter += 4;
		}
		input.close();
	}

}
