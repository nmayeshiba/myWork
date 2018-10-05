package mathOperators;

import java.util.Scanner;

public class AgeToVote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("WHAT is your age?");
		int age = input.nextInt();
		System.out.println("In 17,386 years, you'll be dead.");
		age = 18 - age;
		if(age == 1) 
		{
		System.out.println("However, in " + age + " year, you'll be able to vote.");	
		} else 
			{
			System.out.println("However, in " + age + " years, you'll be able to vote.");
			}
		input.close();
	}

}
