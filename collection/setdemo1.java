package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class setdemo1 {
//default capacity 16
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(100);
		hs.add(290);
		hs.add(56);
		System.out.println(hs);
		Iterator i = hs.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("------------------------------");

		for (Object a : hs) {
			System.out.println(a);
		}
		System.out.println("-----------------soting method-------------");
		List list=new ArrayList(hs);
		Collections.sort(list);
		System.out.println(list);

	}

}
