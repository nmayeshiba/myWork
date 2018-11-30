package strings;
import java.util.Scanner;
public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String password1 = "one";
		String password2 = "two";
		while(!password1.equals(password2))
		{
		System.out.println("Enter a new password.");
		password1 = input.nextLine();
		System.out.println("Re-enter the password to verify it.");
		password2 = input.nextLine();
		if(!password1.equals(password2))
			{
			System.out.println("The password did not match the verified password.");
			}
		}
		System.out.println("New password has been saved.");
		input.close();
	}

}
