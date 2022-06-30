package Collections;

import java.util.HashMap;

public class HashMapUseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map = new HashMap<>();
		map.put(1, "Student1");
		map.put(2, "Student2");
		map.put(3, "student3");
		System.out.println(map);
		System.out.println(map.get(2));
		System.out.println(map.replace(3, "Syed"));
		System.out.println(map);
		HashMap Map1=new HashMap();
		Map1.put("Syed", 50);
		System.out.println(Map1);
		

	}

}
