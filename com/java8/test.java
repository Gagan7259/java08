package com.java8;

public class test {
public static void main (String[] args) {
	what a1=new what();
	System.out.println(a1.a);
	a1.display();
	k a2=new k();
	System.out.println(a2.b);
	a2.display();
}
}
class what{
	int a=10;
	public void display() {
		System.out.println("class a-method");
	}
}
class k extends what{
	int b=200;
	public void display() {
		System.out.println("class -method");
	}
}
//if both class names are duplicate we use super()