package inputExamples;
import java.util.Scanner;
public class Bones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many bones have you broken, knucklehead?");
		int bonesBroken = input.nextInt();
		if (bonesBroken >= 10)
		{
		System.out.println("how are you still alive with " +bonesBroken + " broken bones");	
		} else 
			{
			System.out.println("You broke " + bonesBroken + " bones?? Lame.");
			}
		input.close();
	}

}
