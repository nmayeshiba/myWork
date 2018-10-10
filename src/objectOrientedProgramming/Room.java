package objectOrientedProgramming;
import java.util.Scanner;
public class Room {
Scanner input = new Scanner(System.in);
public Room() 
{
	
}
public void area() 
	{
	System.out.println("What is the length of the wall?");
	int wallLength = input.nextInt();
	System.out.println("What is the height of the wall?");
	int wallHeight = input.nextInt();
	System.out.println("Wall area: " + wallLength*wallHeight);
	}
public void areaWithDoor()
	{
	System.out.println("What is the length of the wall?");
	int length = input.nextInt();
	System.out.println("What is the height of the wall?");
	int height = input.nextInt();
	System.out.println("What is the door's length?");
	int doorLength = input.nextInt();
	System.out.println("What is the door's height?");
	int doorHeight = input.nextInt();
	int doorArea = doorLength * doorHeight;
	int wallArea = length*height;
	int roomArea = wallArea - doorArea;
	System.out.println("Area of the room without the door: " + roomArea + ".");
	input.close();
	}
}
