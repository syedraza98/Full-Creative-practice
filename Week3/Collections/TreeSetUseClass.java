package Collections;

import java.util.TreeSet;

public class TreeSetUseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet tree = new TreeSet();
		tree.add(3);
		tree.add(1);
		tree.add(2);
	//	tree.add("name");
		System.out.println(tree);
		System.out.println(tree.remove(2));
		System.out.println(tree.contains(1));
		

	}

}
