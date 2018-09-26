package inputExamples;
import java.util.Scanner;
public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input  = new Scanner(System.in);
        System.out.println("First number:");
        int numberOne = input.nextInt();
        System.out.println("Second number:");
        int numberTwo = input.nextInt();
        System.out.println("Third number:");
        int numberThree = input.nextInt();
        System.out.println(numberOne + numberTwo + numberThree);
        System.out.println(numberOne + numberThree + numberTwo);
        System.out.println(numberThree + numberTwo + numberOne);
        System.out.println(numberTwo + numberThree + numberOne);
        System.out.println(numberTwo + numberOne + numberThree);  
        System.out.println(numberThree + numberOne + numberTwo);
        input.close();
	}

}
