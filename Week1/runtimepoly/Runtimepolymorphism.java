package runtimepoly;

public class Runtimepolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		University v=new College1(10);
		System.out.println(v.isengineeringcollege());
		College1 c=new College1(10);
		c.print();
		

	}

}
