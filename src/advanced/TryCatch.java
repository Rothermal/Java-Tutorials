package advanced;

public class TryCatch {
	public static void main(String args[]){
		int num1, num2;
		try{
		num1 = 0;
		num2 = 14 / num1;
		System.out.println("Inside try block");
		}
		catch(ArithmeticException e){
			// catch diving by 0 exception
			System.out.println("Error: Dont Divide a number by 0");
			
			
		}
		System.out.println("outside of the catch block");
	}
}
