package com.manish.assignments.four;

public class Subject {
	
	private int marks;
	private Grade grade;
	private	String name;
	
	Subject(String name, int marks){
		this.name=name;
		this.marks=marks;
		this.grade=Grade.F;
		if(this.marks>=60) {
			this.grade=Grade.C;
			if(this.marks>=70) {
				this.grade=Grade.B;
				if(this.marks>=80) {
					this.grade=Grade.A;
					if(this.marks>=90) {
						this.grade=Grade.Ex;
					}
				}
			}
		}
	}
	
	public String getName() {return this.name;}
	public int getMarks() {return this.marks;}
	public Grade getGrade() {return this.grade;}
}
