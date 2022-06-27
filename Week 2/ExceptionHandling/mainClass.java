package ExceptionHandling;

public class mainClass {
	public static void divide(int a,int b) throws DivideByZeroException {
		if(b==0) {
			throw new DivideByZeroException();
		}
		else {
			System.out.println(a/b);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			divide(5,0);
			System.out.print("you are in try block");
		} catch (DivideByZeroException e) {
			// TODO Auto-generated catch block
			System.out.println("you are dividing with 0");
		}
		finally {
			System.out.println("finally");
		}
		System.out.print("you are in main");
	}

}
