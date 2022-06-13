package schoolmanagement;

public class Student extends School{
	
	private final int Roll;
	private final String Name;
	private int Class;
	public boolean isPaid;
	private int studentFees;
	public Student(int roll,String Name) {
		this.Roll=roll;
		this.Name=Name;
		
	}
	public void setStudClass(int Class) {
		this.Class=Class;
	}
	public void setStudentFess(int fees) {
		studentFees=fees;
	}
	public int getRollNo() {
		return Roll;
	}
	public int getStudClass() {
		return Class;
	}
	public String getName() {
		return Name;
	}
	public int getStudentFees() {
		return studentFees;
	}
	
	public void showStudentDetails(int roll) {
		Student stud=super.getStudentDetails(roll);
		System.out.println("Student Name: "+stud.Name);
		System.out.println("Student Roll: "+stud.Roll);
		System.out.println("Student Student Fees: "+stud.studentFees);
		System.out.println("is fees paid or not: "+stud.isPaid);
		
	}
	public int getNumberOfStudents() {
		 return super.getNumberOfStudents();
	 }
	
	
	
	

}
