package org.sample;

public class Employee2 {

	public Employee2() {
		this(90);
		System.out.println("No argument constructor");
	}
	public Employee2(int idno) {
		this("Ranjith");
		System.out.println("parametrised constructor");
		System.out.println(idno);
	}
	public Employee2(String name) {
		this(333.33f);
		System.out.println(" constructor");
		System.out.println(name);
	}
	public Employee2(float avg) {
		System.out.println("No argument constructor");
		System.out.println(avg);
	}
	public static void main(String[] args) {
		Employee2 e=new Employee2();
	}
	
}
