package com.manish.assignments.four;

import java.util.Scanner;

public class Student {
	
	private static int roll;
	private String name;
	private float attendence=100;
	
	Subject subjects[]=new Subject[2];
	
	Student(String name){
		this.roll++;
		this.name=name;
		System.out.println("Please enter name of subject and marks obtained in it");
		for(int i=0;i<this.subjects.length;i++) {
			Scanner myObj = new Scanner(System.in);
			System.out.print("Name of subject: ");
			String nameS = myObj.nextLine();
			System.out.printf("Marks in subject: %1s\n",nameS);
			int marks = myObj.nextInt();
			System.out.printf("echo input: %1s>%2d\n",name,marks);
			subjects[i]=new Subject(name,marks);
		}
	}
	
	public String getName() {return this.name;}
	public int getRoll() {return this.roll;}
	public float getAttendence() {return this.attendence;}
	public void setAttendence(float inp) {this.attendence=inp;}
	
	public boolean passed() {
		for(Subject s:this.subjects)
			if((s.getGrade()==Grade.F)&&this.attendence>=70) return false;
		return true;
	}
	
}
