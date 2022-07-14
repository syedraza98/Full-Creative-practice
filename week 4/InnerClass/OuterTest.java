package InnerClass;

public class OuterTest {
	 static int data=30;  
	  static class Inner{  
	   void msg(){System.out.println("data is "+data);}
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 OuterTest.Inner obj=new OuterTest.Inner();  
		  obj.msg(); 

	}

}
