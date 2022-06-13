package schoolmanagement;

import java.util.ArrayList;

public class School {
	private static ArrayList<Student> Students=new ArrayList<>();
	private static ArrayList<Teacher> Teachers=new ArrayList<Teacher>();
	// protected static int countNumStudents;
//	 protected static int countNumTeachers;
	
	 public void addTeachers(Teacher t1) {
			// TODO Auto-generated method stub
			Teachers.add(t1);
			
			
		}
	 public void addStudent(Student s1) {
			// TODO Auto-generated method stub
			Students.add(s1);
			
			}
	 
	 protected Student getStudentDetails(int roll) {
		 return Students.get(roll);
	 }
	 protected Teacher getTeacherDeatails(int Id) {
		 return Teachers.get(Id);
		 
	 }
	 protected int getNumberOfStudents() {
		 return Students.size();
	 }
	 
	 protected int getNumberOfTeachers() {
		 
		return Teachers.size();
	 }
	 
	 
	
}
