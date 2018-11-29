package outputExamples;
import java.util.Scanner;
public class FavoriteMovie 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String movie;
		System.out.println("Tell me your favorite movie.");
		movie = input.nextLine();
		System.out.println(movie + " is your favorite movie? Lame.");
		input.close();
	}

}	
