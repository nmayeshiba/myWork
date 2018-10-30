package decisionStructures;
import java.util.Scanner;
public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How much money do you make a year?");
		double money = input.nextDouble();
		if(money <= 20000)
		{
		System.out.println("It's obvious now, you're a worker!");	
		}
		if(money > 20000 && money <= 40000 )
		{
		System.out.println("It's obvious now, you're a manager!");	
		}
		if(money > 40000 && money <= 100000)
		{
		System.out.println("It's obvious now, you're a CEO!");	
		}
		if(money > 100000)
		{
		System.out.println("It's obvious now, you're the owner!");	
		}
		input.close();
	}

}
