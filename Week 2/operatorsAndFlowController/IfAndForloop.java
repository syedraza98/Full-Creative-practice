package operatorsAndFlowController;

import java.util.Scanner;

public class IfAndForloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of Inputs ");
		int n=s.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int sum=0;
		int mul=1;
		
		
		
		for(int i : arr) {
			sum+=i;
			mul*=i;
			
		}
		System.out.print("sum of array = "+sum);
		if(mul<1000) {
			System.out.print(" and Mulpication value is = " +mul);
		}
		else {
			System.out.print(" and multiplication value is crossed 1000");
		}
		
	}

}
