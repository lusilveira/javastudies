package jokenpo;

import java.util.Scanner;

public class JoKenPo {

	public static void main(String[] args) {
		int player, computer;
		Scanner hand = new Scanner(System.in);
		
		System.out.println("JoKenPô");
		System.out.println("");
		System.out.println("1. Stone");
		System.out.println("2. Paper");
		System.out.println("3. Scissors");
		System.out.println("4. Needle");
		System.out.println("Enter desired option");
		//player logic
		player = hand.nextInt();
		System.out.println("");
		switch (player) {
		case 1:
			System.out.println("Player chose Stone");
			break;
		case 2:
				System.out.println("Player chose Paper");
				break;
		case 3:
			System.out.println("Player chose Scissors");
			break;
		case 4:
			System.out.println("Player chose Needle");
			break;
		default:
			System.out.println("Please enter a valid number");
			
		}
		//computer logic
		computer = (int)(Math.random()*4 + 1);
		hand.close();
		switch (computer) {
		case 1:
			System.out.println("Computer  chose Stone");
			break;
		case 2:
				System.out.println("Computer chose Paper");
				break;
		case 3:
			System.out.println("Computer chose Scissors");
			break;
		case 4:
			System.out.println("Computer chose Needle");
			break;
	}
		//Logic to determine the Winner
		if (player == computer) {
			System.out.println("A TIE");
		} else {
			if ((player == 1 && computer == 4) ||	// (P) Stone 	(C) Needle 
				(player == 1 && computer == 3) ||	// (P) Stone 	(C) Scissors 
				(player == 2 && computer == 1) ||	// (P) Paper 	(C) Stone 
				(player == 3 && computer == 2) ||	// (P) Scissors (C) Paper
				(player == 3 && computer == 4) ||	// (P) Needle	(C) Paper 
				(player == 4 && computer == 2)) 
			{
				System.out.println("Player Won");
			}else {
				System.out.println("Computer Won");
			}
		}
		
}
	}

