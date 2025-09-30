package org.program;

public class Employee {
//	private int id;
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getSal() {
//		return sal;
//	}
//
//	public void setSal(int sal) {
//		this.sal = sal;
//	}
//
//	private String name;
//	private int sal;
	
	private int id;
	private String name;
	private String address;
	private int sal;
	
	public Employee(int id, String name, String address, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.sal = sal;
	}
	
	public void show() {
		System.out.println("id: "+id);
		System.out.println("name: "+name);
		System.out.println("address: "+address);
		System.out.println("sal: "+sal);
	}
}
