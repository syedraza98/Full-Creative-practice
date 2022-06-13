package schoolmanagement;

public class SchoolManagementMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1,"Sunny");
		s1.setStudClass(1);
		s1.isPaid=true;
		School Sc = new School();
		Sc.addStudent(s1);
		s1.showStudentDetails(0);
		
		
		System.out.println(Sc.getNumberOfStudents());
		
		Teacher t = new Teacher(101,"Michel Sir",42);
		Sc.addTeachers(t);
		t.showTeacherDeatails(0);
		
		System.out.println(Sc.getNumberOfTeachers());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
	}

}
