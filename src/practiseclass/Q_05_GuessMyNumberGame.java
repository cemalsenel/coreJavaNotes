package practiseclass;

import java.util.Random;
import java.util.Scanner;

public class Q_05_GuessMyNumberGame {

	public static void main(String[] args) {
		/*
		 * Write a program that generates a random number and asks the user to guess
		 * what the number is. If the user's guess is higher than the random number, the
		 * program should display "Too high, try again." If the user's guess is lower
		 * than the random number, the program should display "Too low, try again." The
		 * program should use a loop that repeats until the user correctly guesses the
		 * random number.
		 */
		
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		System.out.println("Guess a number");
		System.out.println();
	    int number = random.nextInt(101);
	    int guess = 0;
	    int tries = 0;
	    
	    do {
	    	System.out.println("=====> Guess a number <=====");
	    	guess = scan.nextInt();
	    	tries++;
	    	if(guess>number) {
	    		System.out.println("Too high,try again");
	    	}else if(guess<number) {
	    		System.out.println("Too low, try again");
	    	}else {
	    		System.out.println("Correct! You got it in " + tries + " guesses.");
	    	}
	    	
	    }while(guess != number);
		
		
		

	}

}
