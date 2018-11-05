package objectOrientedProgramming;
import java.util.Scanner;
public class Sandbox {
Scanner input = new Scanner(System.in);
public Sandbox()
	{	
	
	}
public void fillSandbox()
	{
	System.out.println("What is the length of the sandbox?");
	int length = input.nextInt();
	System.out.println("What is the width of the sandbox?");
	int width = input.nextInt();
	System.out.println("What is the depth of the sandbox?");
	int depth = input.nextInt();
	System.out.println("How much sand can be transported per hour? (Cubic Feet)");
	int rate = input.nextInt();
	int volume = length*width*depth;
	int totalTime = volume/rate;
	System.out.println("It will take " + totalTime + " hours to fill the sandbox.");
	}
}
