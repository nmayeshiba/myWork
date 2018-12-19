package arrays;
import java.util.Scanner;
public class FriendNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String names[] = new String[20];
		int counter = 0;
		int goodSize = 0;
		for(counter = 0; counter < 20; counter++)
		{
		System.out.println("Enter a name of a friend.");	
		names[counter] = input.nextLine();
		System.out.println("Name Stored.");
		}
		System.out.println("How long should the names be?");
		String nameLength = input.nextLine();
		input.close();
	}

}
