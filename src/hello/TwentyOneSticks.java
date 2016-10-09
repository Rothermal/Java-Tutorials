package hello;

import java.util.Scanner;

public class TwentyOneSticks {
	
	public static void main(String args []){
		int sticks = 21;
		int player;
		int computer;
		int pickup;
		Scanner input = new Scanner(System.in);
		Scanner numOfSticks = new Scanner(System.in);
		System.out.println("Would you like to go first? Y/N");
		String goFirst = input.nextLine();
		
		while(sticks > 0){
			char result = goFirst.charAt(0);
			if(result == 'y' || result == 'Y'){
				System.out.println("It Is Your Turn");
				System.out.println("There are "+sticks+" left");
				System.out.println("How many sticks would you like to take ( 1 or 2 )");
			    pickup = numOfSticks.nextInt();
				if (pickup > 2){
					pickup = 2;
				}
				else if (pickup < 2){
					pickup = 1;
				}
				
				sticks = (sticks - pickup);
				System.out.println("There are "+sticks+" left");
				if(sticks <= 0){
					System.out.println("YOu LOSE!!!!");
				}
				else{
					if((sticks - 2) % 3 == 0 || sticks -2 == 0 ){
						pickup = 1;
					}
					else {
						pickup = 2;
					}
					
					System.out.println("The Computer takes "+pickup+" sticks!");
					
					sticks = (sticks - pickup);
					
					System.out.println("There are "+sticks+" sticks left");
					
					if(sticks <= 0){
						System.out.println("You Win!!!");
					}
					
				}
			}
			else{
				
				System.out.println("It is the Computer's turn");
				if((sticks - 2) % 3 == 0 || sticks -2 == 0 ){
					pickup = 1;
				}
				else {
					pickup = 2;
				}
				
				System.out.println("The Computer takes "+pickup+" sticks!");
				
				sticks = (sticks - pickup);
				
				System.out.println("There are "+sticks+" sticks left");
				
				if(sticks <= 0){
					System.out.println("You Win!!!");
				}
				else  {
					System.out.println("It Is Your Turn");
					System.out.println("There are "+sticks+" left");
					System.out.println("How many sticks would you like to take ( 1 or 2 )");
				    pickup = numOfSticks.nextInt();
					if (pickup > 2){
						pickup = 2;
					}
					else if (pickup < 2){
						pickup = 1;
					}
					
					sticks = (sticks - pickup);
					System.out.println("There are "+sticks+" left");
					if(sticks <= 0){
						System.out.println("YOu LOSE!!!!");
					}
				}

			}
		}
	}
}
