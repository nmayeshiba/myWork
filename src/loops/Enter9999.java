package loops;
import java.util.Scanner;
public class Enter9999 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = 0;
		while(num != 9999)
		{
		System.out.println("Enter a number. (9999 to quit)");
		num = input.nextInt();
		if(num!= 9999)
		{
		System.out.println("The number times 2 is " + num*2);
		}
		}
		System.out.println("The program is over.");
		input.close();
	}

}
