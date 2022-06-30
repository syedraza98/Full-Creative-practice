package Collections;
import java.util.ArrayList;

import java.util.List;
public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		for(int i=3;i<=10;i++) {
			arr.add(i);
		}
		for(int i : arr) {
			System.out.print(i+" ");
		}
		arr.set(1, 100);
		System.out.println();
		for(int i : arr) {
			System.out.print(i+" ");
		}
		arr.remove(1);
		System.out.println("\n"+arr);
		System.out.println(arr.contains(100));
		System.out.println(arr.indexOf(9));
	}

}
