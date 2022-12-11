package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class linkedlistset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(190);
		al.add(200);
		al.add(20);
		al.add(30);
		al.add(50);

		System.out.println("inserted order");

		Iterator l = al.iterator();
		while (l.hasNext()) {
			System.out.println(l.next());
		}
		System.out.println("------iterator---------");

		Object obj = new Object();
		for (Object a : al) {
			System.out.println(a);
		}
		System.out.println("------sorting order---------");
		Collections.sort(al);
		Collections.sort(al, Collections.reverseOrder());

		System.out.println(al);
		System.out.println("------Shuffle order---------");
		Collections.shuffle(al);
		System.out.println(al);
	}

}
