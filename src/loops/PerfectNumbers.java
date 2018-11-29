package loops;

public class PerfectNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		int number = counter - 1;
		for(counter = 1; counter <= 1000; counter++)
		{
		if(counter%number == 0)
			{
			System.out.println(counter + " is a perfect number.");
			}
		}
	}

}
