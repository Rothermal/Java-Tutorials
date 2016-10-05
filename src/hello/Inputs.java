package hello;

import java.util.Scanner;

public class Inputs {
	public static void main(String args []){
// note scanners do not mix types well, use one scanner for int and another for strings 		
//		System.out.println("inputs");
//		Scanner scan = new Scanner(System.in);
//		scan.nextLine();
//		String input = scan.nextLine();
//		System.out.println(input);
	System.out.println("Input the first number to add");	
	Scanner scan = new Scanner(System.in);
	int num1 = scan.nextInt();
	System.out.println("Input the second number to add");	
	int num2 = scan.nextInt();
	int total = num1 + num2;
	System.out.println("Your total = " + total);
	}
}
