package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class arraylistset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();
		a.add(100);
		a.add(190);
		a.add(200);
		a.add(20);
		a.add(30);
		a.add(50);

		System.out.println("inserted order");

		Iterator l = a.iterator();
		while (l.hasNext()) {
			System.out.println(l.next());
		}
		System.out.println("------iterator---------");

		Object obj = new Object();
		for (Object a1 : a) {
			System.out.println(a1);
		}
		System.out.println("------sorting order---------");
		Collections.sort(a);
		Collections.sort(a,Collections.reverseOrder());

		System.out.println(a);
		System.out.println("------Shuffle order---------");
Collections.shuffle(a);
System.out.println(a);
		
	}

}
