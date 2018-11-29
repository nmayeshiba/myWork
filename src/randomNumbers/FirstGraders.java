package randomNumbers;
import java.util.Random;
public class FirstGraders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		int min = 26;
		int max = 43;
		int overThreeFeet = 0;
		int randomNum = 0;
		for(int counter = 1; counter <= 248; counter++)
		{
		randomNum = min + generator.nextInt(max - min + 1);
		if(randomNum >= 36)
			{
			overThreeFeet++;
			}
		}
		System.out.println(overThreeFeet + " first graders were over three feet.");
	}

}
