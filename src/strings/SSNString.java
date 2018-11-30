package strings;
import java.util.Scanner;
public class SSNString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String split1 = "a";
		String split2 = "a";
		String split3 = "a";
		System.out.println("Enter your Social Security Number (XXX-XX-XXXX)");
		String social = input.nextLine();
		split1 = social.substring(0,3);
		split2 = social.substring(4,6);
		split3 = social.substring(7,11);
		System.out.println(split1);
		System.out.println(split2);
		System.out.println(split3);
		input.close();
	}

}
