package org.sample;

public class Company extends  Employee3{

	public Company() {
		super(40);
		System.out.println("Child class");
	}
	public Company(int id) {
		super("Ranjith");
		System.out.println(id);
	}
	public Company(String name) {
		System.out.println(name);
	}
	public static void main(String[] args) {
		Company c=new Company();
		Company c1=new Company(43);		
	}

}
