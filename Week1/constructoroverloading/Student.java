package constructoroverloading;

public class Student {
	int roll;
	String name;
	Student(int roll){
		this.roll=roll;
	}
	Student(String name){
		this.name=name;
	}
	Student(String name,int roll){
		this.name=name;
		this.roll=roll;
	}
	public int getroll() {
		return roll;
		
	}
	public String getname() {
		return name;
	}
	
		
				
	
}
