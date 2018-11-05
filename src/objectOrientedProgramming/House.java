package objectOrientedProgramming;
import java.util.Scanner;
public class House {
Scanner input = new Scanner(System.in);
public House()
	{
	
	}
public void paintWall()
	{
	System.out.println("What is the length of the wall?");
	double wLength = input.nextDouble();
	System.out.println("What is the height of the wall?");
	double wHeight = input.nextDouble();
	}
}
