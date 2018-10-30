package decisionStructures;
import java.util.Scanner;
public class ShoeSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your height?");
		double height = input.nextDouble();
		System.out.println("What is your Shoe Size?");
		double shoeSize = input.nextDouble();
		System.out.println(height == 62 && shoeSize > 9);
		input.close();
	}

}
