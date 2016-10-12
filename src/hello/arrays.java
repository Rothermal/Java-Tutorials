package hello;

import java.util.Scanner;

public class arrays {

	public static void main(String args []){
		int [] numbers = new int [5];	
		numbers[0] = 15;
		numbers[1] = 225;
		numbers[2] = 115;
		numbers[3] = 15;
		numbers[4] = 145;
//		numbers[5] = this would error because you only declared an array with 5 spots
		
		int [] a = new int[10];
		for(int i = 0; i<a.length; i++){
			a[i]=i;	
		}
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int[] b = new int[x];
		
		char[] letters = {'a','b','c','d','e'};
		// note char values are single quote, strings are double quote...
		
		
		
	}
}
