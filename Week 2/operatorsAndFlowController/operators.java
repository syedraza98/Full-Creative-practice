package operatorsAndFlowController;

import java.util.Scanner;

public class operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=6;
		
		if(a!=b) {
			System.out.println("true");
			
		}
		else if(a==b){
			System.out.println(false);
		}
		else if(a>=b && b>=a) {
			System.out.print(" a is greater");
		}
		else if(a>=b || b>=a) {
			System.out.println("b is greater");
		}
		else {
			System.out.println("Equal");
		}
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter value of x :");
		int x=s.nextInt();
		switch(x) {
		case 1: System.out.print("case 1 hitted");
					break;
		case 2:System.out.println("case 2 hitted");
					break;
		default: System.out.println("default is hitted");			
		}
	}

}
