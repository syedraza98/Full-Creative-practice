package javainterface;

public class Student implements College,university{
	private int course;
	private int year;
	public int numberOfCourse(int course) {
		this.course=course;
		return course;
	}
	public int yearOfAdmission(int year) {
		this.year=year;
		return year;
	}
	@Override
	public boolean isPartof() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
