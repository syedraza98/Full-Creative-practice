package ExceptionHandling;

import java.util.Scanner;

public class UncoughtException {
	public static void check(int n) throws NegativeNumberException{
		if(n<0) {
			
			throw new NegativeNumberException();
			
		}
	}
	public static int Factorial(int n) {
		try {
			check(n);
		} catch (NegativeNumberException e) {
			// TODO Auto-generated catch block
			System.out.println("Number is negative");
			return n;
		}
		
		if(n==0) {
			return 1;
		}
		return n*Factorial(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n=s.nextInt();
		
		int fact=Factorial(n);
		System.out.println(fact);

	}

}
