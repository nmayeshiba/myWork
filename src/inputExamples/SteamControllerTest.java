package inputExamples;
import java.util.Scanner;
public class SteamControllerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
		System.out.println("Is the controller working well?");
		boolean answer  = input.nextBoolean();
		System.out.println("Steam Controller good? " + answer);
	}

}
