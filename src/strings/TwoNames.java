package strings;
import java.util.Scanner;
public class TwoNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first name.");
		String name1 = input.nextLine();
		System.out.println("Enter the second name.");
		String name2 = input.nextLine();
		if(name1.charAt(0) == name2.charAt(0))
			{
			System.out.println(name1 + " and " + name2 + " start with the same letter.");
			}
		if(name1.charAt(0) < name2.charAt(0))
			{
			System.out.println(name1 + " comes first alphabetically.");
			} else {
			System.out.println(name2 + " comes first alphabetically.");
			}
		input.close();
	}

}
