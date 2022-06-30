package Collections;

import java.util.LinkedList;

public class LinkedListUseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList<>();
		ll.add(1);
		ll.add("Name");
		ll.add('A');
		System.out.print(ll);
		ll.set(2, 2.33);
		System.out.print(ll);
		System.out.println(ll.remove(2.33));
		System.out.println(ll);
		System.out.println(ll.indexOf("name"));
		System.out.println(ll.indexOf("Name"));
		for(Object i : ll) {
			System.out.println(i);
		}
		

	}

}
