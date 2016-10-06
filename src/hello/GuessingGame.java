package hello;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	public static void main(String args[]){
		
		Random rand = new Random();
		int numberToGuess = rand.nextInt(1000);
		int numberOfTries = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Guess a number between 1 and 1000: ");
		
	}
}
