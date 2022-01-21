package imc;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		// read user keyboard
		Scanner reader = new Scanner(System.in);
		
		
		// Creating the variables for the calculation 
		System.out.print("Enter your weight:");
		int userWeight = reader.nextInt();
		
		System.out.print("\nEnter your height:");
		double userHeight = reader.nextDouble();
		
		double imc = userWeight /( userHeight*userHeight );
		
		System.out.println("");
		System.out.println(imc);
		
		reader.close();
	}

}
