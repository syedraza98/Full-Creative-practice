package GetterSetter;

public class mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 s=new Student2();
	//	System.out.print(s.isnegative(1,2));
		System.out.println(s.add(1, 5));
		s.increament();
		System.out.println(s.getcount());
		Student2 s1=new Student2();
		s1.increament();
		System.out.println(s1.getcount());
		String str=Student2.getyourname("sunny");
		System.out.println(str);

	}

}
