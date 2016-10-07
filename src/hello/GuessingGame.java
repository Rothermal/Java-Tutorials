package hello;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	@SuppressWarnings("resource")
	public static void main(String args[]){
		
		Random rand = new Random();
		int numberToGuess = rand.nextInt(1000) + 1 ;
		int numberOfTries = 0;
		boolean win = false;
		Scanner input = new Scanner(System.in);
		int guess;

		while(win == false){
			System.out.println("Guess a number between 1 and 1000: ");
			guess = input.nextInt();
			numberOfTries++;
			
			if(guess == numberToGuess){
				win = true;
			}			
			else if(guess > numberToGuess){
				System.out.println("To High, Guess again!");
			}
			else if (guess < numberToGuess){
				System.out.println("To Low, Guess again!");
			}
		}
		System.out.println("Just Right, YOu did it!");
		System.out.println("The Correct Number was " + numberToGuess );
		System.out.println("It took you "  + numberOfTries + " Tries" );


	}
}
