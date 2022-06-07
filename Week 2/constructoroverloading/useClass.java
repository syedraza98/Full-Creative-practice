package constructoroverloading;

public class useClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student(10);
		Student s1= new Student("Syed");
		Student s2 = new Student("Sunny",2);
		System.out.println(s.getroll());
		System.out.println(s1.getname());
		System.out.print(s2.getname()+" " + s2.getroll());
	}

}
