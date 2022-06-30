package Collections;

import java.util.TreeMap;

public class TreeMapUseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap tm = new TreeMap();
		tm.put(1, "Hey");
		tm.put(100, 3);
		//tm.put('A', 3);
		tm.put(4,2.33);
		System.out.println(tm);
		System.out.println(tm.containsValue(3));
		System.out.println(tm.get(4));

	}

}
