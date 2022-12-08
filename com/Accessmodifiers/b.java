package com.Accessmodifiers;

public class b extends a {
public static void main(String [] args) {
	a o=new a();
	//System.out.println(o.K);//we cant access outside the class
	System.out.println(o.b);
	System.out.println(o.c);
	System.out.println(o.d);

}
}
