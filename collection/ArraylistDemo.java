package collection;

import java.util.ArrayList;
import java.util.List;

public class ArraylistDemo {

	public static void main(String[] args) {
		ArrayList al1 = new ArrayList();
		List al = new ArrayList();
		al.add(20);
		al.add(60);
		al1.add(true);
		al1.add(20);
		al1.add("gagan");
		al1.add('k');
		al1.addAll(al);
		System.out.println(al);
		System.out.println(al1);

		// if u want specific index value we use get() method
		System.out.println(al1.get(3));
		// System.out.println(al1.get(7));
		System.out.println(al1.get(5));
		System.out.println(al1.contains(20));
		System.out.println(al1.isEmpty());
System.out.println("---------------------------------------");
//print all values
		for (int i = 0; i <= al1.size() - 1; i++) {
			System.out.println(al1.get(i));
			System.out.println("--------------");
			for(Object obj:al1) {
				System.out.println(obj);
			}
		}

	}

}
