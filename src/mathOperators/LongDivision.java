package mathOperators;
import java.util.Scanner;
public class LongDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int dividend = 0;
		int divisor = 0;
		int answer = 0;
		int remainder = 0;
		System.out.println("What is the dividend?");
		dividend = input.nextInt();
		System.out.println("What is the divisor?");
		divisor = input.nextInt();
		answer = dividend/divisor;
		remainder = dividend%divisor;
		System.out.println("The answer is: " +answer + "r" +remainder );
		input.close();
	}

}
