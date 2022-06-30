package Collections;

import java.util.HashSet;

public class HashSetUseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet Hs= new HashSet();
		Hs.add(1);
		Hs.add("tree");
		Hs.add(1.112);
		Hs.add("tree");
		System.out.println(Hs);
		int size=Hs.size();
		System.out.println(size);
		Hs.add(2);
		System.out.println(Hs);
		for(Object i: Hs ) {
			System.out.println(Hs);
		}
		
	}

}
