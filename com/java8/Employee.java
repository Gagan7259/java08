package com.java8;

public class Employee {
	private int id;
	private String Name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}

}
class b{
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setId(100);
		System.out.println(e1.getId());
	}
}
class a{
	public static void main(String[] args) {
		Employee e2=new Employee();
		e2.setName("Gagan");
		System.out.println(e2.getName());
	}
}