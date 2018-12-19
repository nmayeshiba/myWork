package strings;
import java.util.Scanner;
public class PasscodeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Passcode bob = new Passcode();
		Scanner input = new Scanner(System.in);
		String pass = "heck";
		String confirm = "confirm";
		int confirmtries = 0;
		int passtries = 0;
		do {
		System.out.println("Please enter a new password in the format Last Name:Password.");
		pass = input.nextLine();
		pass = pass.substring(pass.indexOf(":") + 1
				
				
				
				);
		System.out.println(pass);
		bob.setPassword(pass);
		passtries++;
		} while (bob.setPassword(pass) != true);
		do {
		System.out.println("Please confirm the password.");
		confirm = input.nextLine();
		confirmtries++;
		} while (bob.match(confirm) != true);
		System.out.println("It took " +passtries + " tries to enter a valid password.");
		System.out.println("It took " +confirmtries + " tries to confirm the password.");
		input.close();
	}

}