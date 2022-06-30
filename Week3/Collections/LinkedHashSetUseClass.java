package Collections;

import java.util.LinkedHashMap;

public class LinkedHashSetUseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put(1,1);
		lhm.put(2,2);
		lhm.put("Syed", 50);
		System.out.println(lhm);
		lhm.put(3,3);
		System.out.println(lhm);
		System.out.println(lhm.get("Syed"));
		System.out.println(lhm.replace("Sunny", 100));
		System.out.println(lhm.replace("Syed", 100));
		System.out.println(lhm);
		
		

	}

}
