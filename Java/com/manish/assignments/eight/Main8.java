//============================================================================
// Name        : eight
// Author      : Manish Patil
// Version     : 1.0
// Copyright   : MIT lisence
// Description : Program to read name of student rol no and total marks and display
//============================================================================

package com.manish.assignments.eight;

import java.util.Scanner;

public class Main8 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
				
		System.out.println("Enter Student Name, Roll no. and Marks\n");
		System.out.println("Name: ");
		String n=s.nextLine();
		System.out.println("Roll: ");
		int r=s.nextInt();
		System.out.println("Marks: ");
		int m=s.nextInt();

		Student manish=new Student(n);
		manish.setRoll(r);
		manish.setMarks(m);
		
		System.out.printf("Student %1s with roll no. %2d has obtained marks %3d",
				manish.getName(),
				manish.getRoll(),
				manish.getMarks());
	}

}
