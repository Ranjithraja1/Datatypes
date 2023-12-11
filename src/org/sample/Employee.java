package org.sample;

public class Employee {

	public Employee() {
		// TODO Auto-generated constructor stub
		System.out.println("employee");
	}
	public Employee(int id ) {
		// TODO Auto-generated constructor stub
		System.out.println("employee id");
		System.out.println(id);
	}
	public Employee(String name) {
		// TODO Auto-generated constructor stub
		System.out.println("employee name");
		System.out.println(name);
	}
	public Employee(float avg,long ph) {
		// TODO Auto-generated constructor stub
		System.out.println("employee avg");
		System.out.println(avg+"\n"+ph);
	}
	
	private void employee() {
		// TODO Auto-generated method stub
System.out.println("Employee details");
System.out.println("Ranjithraja123");
System.out.println("Demoprocess");
	}
	public static void main(String[] args) {
		Employee e=new Employee();
		Employee e1=new Employee(80);
		Employee e2=new Employee("Ranjith");
		Employee e3=new Employee(33.222f,43343434334l);
		e.employee();
		
	}
}
