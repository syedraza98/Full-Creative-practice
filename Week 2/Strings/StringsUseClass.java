package Strings;

public class StringsUseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Practise";
		String str2= "Prbctise";
		String str3="ctise";
		System.out.println(str3.replace('t','a' ));
		System.out.println(str3);
		System.out.println(str1==str2);
		System.out.println(str1.contains(str3));
		System.out.println(str1.substring(3,str1.length()));
		StringBuffer strb = new StringBuffer("Testing");
		System.out.println(strb);
		strb.setCharAt(4, 'a');
		System.out.println("this"+str1.compareTo(str2));
		String str="hello";
		StringBuilder stbd = new StringBuilder("Testing");
		System.out.println(stbd.substring(2, 6));
		System.out.println(stbd.equals(strb));
		System.out.println(stbd.replace(1,5, "Hey"));
		
	/*	String str1="hello1";
		String str2= new String("hello1");
		String str3=str+'1';
		System.out.print(str3==str1);*/
	}

}
