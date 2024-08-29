package com.manish.assignments.eight;

public class Student {
	private String name;
	private int roll;
	private int marks;
	
	Student(String name){
		this.name=name;
	}
	
	public void setRoll(int m) {this.roll=m;}
	public int getRoll() {return this.roll;}
	
	public void setMarks(int m) {this.marks=m;}
	public int getMarks() {return this.marks;}
	
	public String getName() {return this.name;}
}
