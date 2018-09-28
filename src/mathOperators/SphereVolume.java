package mathOperators;
import java.util.Scanner;
public class SphereVolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double radius = 0.0;
		double volume = 0.0;
		System.out.println("What is the radius of the sphere?");
		radius = input.nextDouble();
		volume = (4.0/3.0)*Math.PI*(radius*radius*radius); //Don't forget that when you use integers to divide, it rounds up.
		System.out.println("Volume: " +volume);
		input.close();
		
	}

}
