package Assertion;

import java.util.Scanner;

public class AsserionUseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		while(a<=b) {
			System.out.println("Hello");
			a++;
		}
		assert a>b:"A is greater than B";

	}

}
