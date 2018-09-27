package mathOperators;
import java.util.Scanner;
public class WallArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final double wallHeight = 8.0;
		double wallWidth = 0;
		double wallArea = 0;
		System.out.println("What is the width of the wall?");
		wallWidth = input.nextDouble();
		wallArea = wallWidth*wallHeight;
		System.out.println("The area of the wall is " +wallArea + ".");
		input.close();
	}

}
