package schoolmanagement;

public class Teacher extends School {
	
	private final int TeacherId;
	private final String Name;
	private int age;
	

	
	public Teacher(int TeacherId,String Name){
		this.TeacherId=TeacherId;
		this.Name=Name;
	}
	public Teacher(int TeacherId,String Name,int age) {
		this.TeacherId=TeacherId;
		this.Name=Name;
		this.age=age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public int getTeacherId() {
		return TeacherId;
	}
	public String getName() {
		return Name;
	}
	public int getNumberOfTeachers() {
		 
			return super.getNumberOfTeachers();
	}
	public void showTeacherDeatails(int Id) {
		Teacher T=super.getTeacherDeatails(Id) ;
		System.out.println("Teacher's Name: "+T.Name);
		System.out.println("Teacher's Id: "+T.TeacherId);
		System.out.println("Teacher's Age: "+T.age);
		
	}
	 
	
	
	
	
	
}
