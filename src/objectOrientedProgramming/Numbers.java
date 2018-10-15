package objectOrientedProgramming;

public class Numbers {

public Numbers()
	{
	
	}
public void sayNumber(double a)
	{
	System.out.println("The number you typed is " + a + ", right?");
	}
public void sayNumberPlus2(double b)
	{
	double addition = b + 2;
	System.out.println("When you add two to your number, you get " + addition +".");
	}
public void saySum(double a, double b)
	{
	double whatever = a + b;
	System.out.println("When you add your numbers together, you get "+ whatever + ".");
	}
public double returnSquare(double a)
	{
	double square = a*a;
	return square;
	}
public double returnArea(double length, double width)
	{
	double area = length*width;
	return area;
	}
public double returnRoundUp(double a)
	{
	int roundUp = (int) Math.ceil(a);
	return roundUp;
	}
}
