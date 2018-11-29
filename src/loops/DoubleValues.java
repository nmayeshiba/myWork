package loops;
import java.util.Scanner;
public class DoubleValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double num = 0.0;
		double sum = 0;
		double counter = 0;
		while(num != 9999.0)
		{
		System.out.println("Enter a double. (9999 to quit.)");
		num = input.nextDouble();
		if(num!=9999)
		{
		sum+=num;
		counter++;
		}
		}
		System.out.println("The average of the numbers entered was " + sum/counter + ".");
		input.close();
	}

}
