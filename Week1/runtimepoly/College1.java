package runtimepoly;

public class College1 extends University {
	int numroom;
	
	public College1(int numroom) {
		super(numroom);
		this.numroom=numroom;
	}
	public boolean isengineering() {
		return false;
	}
	public void print() {
		System.out.println("Number of rooms in college is:"+numrooms);
		System.out.println("NUmber of room in university"+super.numrooms);
	}
}
