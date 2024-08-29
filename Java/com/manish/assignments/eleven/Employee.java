package com.manish.assignments.eleven;

public class Employee {
	private String fistName;
	private String lastName;
	
	private double salary;
	
	Employee(String fName, String lName){
		this.fistName=fName;
		this.lastName=lName;
	}
	
	public void setSalary(double m) {this.salary=m;}
	public double getSalary() {return this.salary;}
	
	public String getName() {return this.fistName+this.lastName;}
}
