package Staticblock;

public class staticBlock {
	static int i;
	static String str;
	static {
		i=786;
		str="Static Block";
		System.out.println(str);
	}
	public void print() {
		System.out.println("class block");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main Block");

	}

}
