package randomNumbers;
import java.util.Random;
public class CoinFlip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random(4);
		int coin = 0;
		int heads = 0;
		int tails = 0;
		int counter = 0;
		for(counter = 1; counter <= 100000; counter++)
		{
		coin = generator.nextInt(2);
		if(coin == 0)
			{
			heads++;
			}
		if(coin == 1)
			{
		tails++;
			}
		}
		System.out.println("The coin landed on heads " + heads + " times.");
		System.out.println("The coin landed on tails " + tails + " times.");
	}

}
