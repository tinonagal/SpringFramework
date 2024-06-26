package com;

public class Employee {
private int id;
private String name;
private float salary;
private Address address;
	
	public Employee() {
		System.out.println("Object created..using empty.");
	}

	public void display() {
		System.out.println("This is employee class method");
	}
	

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}

	public Employee(int id, String name, float salary) {
		System.out.println("Object created..using parameter.");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
}
