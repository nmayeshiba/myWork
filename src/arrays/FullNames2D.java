package arrays;
import java.util.Scanner;
public class FullNames2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int rows = 4;
		int columns = 3;
		String [][]names = new String[rows][columns];
		for(rows = 0; rows < names[0].length - 1; rows++)
			{
			for(columns = 0; columns < names[0].length - 1; columns++)
				{
				System.out.print("Enter a name.");
				names[rows][columns] = input.nextLine();
				}
				System.out.println();
			}
		for(rows = 0; rows < names[0].length - 1; rows++)
			{
			for(columns = 0; columns < names[0].length - 1; columns++)
				{
				System.out.println(names[rows][columns].substring(names[rows][columns].indexOf(" ") + 1));
				}
			System.out.println();
			}
		input.close();
	}
}
