package strings;
import java.util.Scanner;
public class SentenceNoSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Type a sentence for me.");
		String sentence = input.nextLine();
		String sentence2 = "test";
		if(sentence.contains("a") || sentence.contains(" "))
		{
		System.out.println(sentence.replaceAll("a", ""));
		sentence2 = sentence.replaceAll("a", "");
		System.out.println(sentence2.replaceAll(" ", ""));
		}
		System.out.println(sentence);
		input.close();
	}

}
