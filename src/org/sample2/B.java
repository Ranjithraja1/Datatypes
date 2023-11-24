package org.sample2;

public class B  extends A{

	public B() {
		super(50);
		System.out.println("defauld constructor");
	}
	public B(int id) {
		super("Ranjith");
		System.out.println(id);
	}
	public B(String name) {
		super(100000);
		System.out.println(name);
	}
	public static void main(String[] args) {
		B b=new B();
		B b1=new B(30);
		B b2 =new B("VINOTH");
		b2.A();
	}
	
}
