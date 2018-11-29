package randomNumbers;
import java.util.Random;
public class Yahtzee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Random generator = new Random();
		    int min = 1;
		    int max = 6;
		    boolean yahtzee = false;
		    while(yahtzee == false)
		    {
		    int num = min + generator.nextInt(max - min + 1);
		    System.out.println("You rolled a " + num + ".");
		    int num2 = min + generator.nextInt(max - min + 1);
		    System.out.println("You rolled a " + num2 + ".");
		    int num3 = min + generator.nextInt(max - min + 1);
		    System.out.println("You rolled a " + num3 + ".");
		    int num4 = min + generator.nextInt(max - min + 1);
		    System.out.println("You rolled a " + num4 + ".");
		    int num5 = min + generator.nextInt(max - min + 1);
		    System.out.println("You rolled a " + num5 + ".");
		if(num == num2) 
		{
		    if(num2 == num3) 
		    {
		        if(num3 == num4) 
		        {
		        	if(num4 == num5) 
		        	{
		        	yahtzee = true;
		            System.out.println("You got a Yahtzee.");
		            }
		        }
		    }

		}
		}
	}

}
