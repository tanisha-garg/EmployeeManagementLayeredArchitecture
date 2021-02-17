package com.cg.empmgt.entities;

public class Employee {
	
	private int id;
	private String name;
	private String department;
	
	public Employee() {
		this("not initialized", "not initialized");
	}
	
	public Employee(String name, String department) {
		this.setName(name);
		this.setDepartment(department);
	}
	
	public void getId() {
		this.id = id;
	}
	
	public int setId(int id) {
		return id;
	}
	
	public void getName() {
		this.name = name;
	}
	
	public String setName(String name) {
		return name;
	}
	
	public void getDepartment() {
		this.department = department;
	}
	
	public String setDepartment(String department) {
		return department;
	}
	
	@Override	
	public String toString() {
		String text = "Name: "+name+" Department: "+department;
		return text;
	}
	

}
