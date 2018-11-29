package randomNumbers;
import java.util.Random;
public class ThirteenDie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		int die = 0;
		int multipleOfThree = 0;
		for(int counter = 1; counter <= 87; counter++) 
		{
		die = generator.nextInt(14);
		if(die % 3 == 0)
			{
			multipleOfThree++;
			}
		}
		System.out.println("The dice rolled a multiple of three " + multipleOfThree + " times.");
	}

}
