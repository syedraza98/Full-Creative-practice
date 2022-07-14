package InnerClass;

public class OuterClass {
	int x=100;
	class innerClass{
		int x=10;
		void m1() {
			int x=1;
		System.out.println("inner class");
		System.out.println(this.x);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass O = new OuterClass();
		OuterClass.innerClass in =O. new innerClass();
		in.m1();
	}

}
