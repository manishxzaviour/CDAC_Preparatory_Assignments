//============================================================================
// Name        : eleven
// Author      : Manish Patil
// Version     : 1.0
// Copyright   : MIT lisence
// Description : Program to read and access Employee first name last name and salary
//============================================================================

package com.manish.assignments.eleven;

import java.util.Scanner;


public class Main11 {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Employee Name and salary\n");
		System.out.println("First Name: ");
		String fn=s.nextLine();
		System.out.println("Last Name: ");
		String ln=s.nextLine();
		System.out.println("Salary: ");
		double sal=s.nextDouble();

		Employee e=new Employee(fn,ln);
		e.setSalary(sal);
		
		System.out.printf("Employee %1s has monthly salary of Rs. %2d",
				e.getName(),
				e.getSalary());		
	}

}
