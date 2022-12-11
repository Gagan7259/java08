package collection;

import java.util.LinkedList;
import java.util.List;

public class Linkedlistdemo {

	public static void main(String[] args) {
		LinkedList ll1 = new LinkedList();
		List ll = new LinkedList();
		ll.add(20);
		ll.add(60);
		ll1.add(true);
		ll1.add(20);
		ll1.add("gagan");
		ll1.add('k');
		ll1.addAll(ll);
		System.out.println(ll1);
		System.out.println(ll1);

		// if u want specific index value we use get() method
		System.out.println(ll1.get(3));
		// System.out.println(al1.get(7));
		System.out.println(ll1.get(5));
		System.out.println(ll1.contains(20));
		System.out.println(ll1.isEmpty());
		System.out.println("---------------------------------------");
//print all values
		for (int i = 0; i <= ll1.size() - 1; i++) {
			System.out.println(ll1.get(i));

		}
		System.out.println("--------------");
		for (Object obj : ll1) {
			System.out.println(obj);
		}

	}

}
