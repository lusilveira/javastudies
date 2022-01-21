package number;
import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		
		Scanner number = new Scanner(System.in);
		System.out.print("Enter a number:");
		
		String digit = number.next();

        int y = Character.getNumericValue(digit.charAt(digit.length()-1));

        boolean isEven = (y&1)==0;

        if(isEven)
            System.out.println("Even");
        else
            System.out.println("Odd");
	}

}
