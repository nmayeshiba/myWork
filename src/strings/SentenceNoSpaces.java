package strings;
import java.util.Scanner;
public class SentenceNoSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Type a sentence for me.");
		String sentence = input.nextLine();
		String sentence2 = "test";
		String sentence3 = "test";
		if(sentence.contains("a") || sentence.contains(" "))
		{
		System.out.println(sentence.replaceAll("A", "a"));
		sentence2 = sentence.replaceAll("A", "a");
		System.out.println(sentence2.replaceAll("a", " "));
		sentence3 = sentence2.replaceAll("a", " ");
		System.out.println(sentence3.replaceAll(" ", ""));
		}
		System.out.println(sentence);
		input.close();
	}

}
