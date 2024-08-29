//============================================================================
// Name        : two
// Author      : Manish Patil
// Version     : 1.0
// Copyright   : MIT lisence
// Description : Program to convert numbers in given set to their factorials
//============================================================================

package com.manish.assignments.two;

import java.util.Scanner;

public class Main2 {
	public static void main(String args[]) {
		System.out.println("Program to convert numbers in given set to their factorials");
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter integer numbers one by one\n^Z when done");
		
		while(s.hasNextInt()) {
			int a=s.nextInt();
			System.out.printf("echo input:      %1s",a);
			System.out.print("\necho Factorial: ");
			System.out.print(Factorial.getFactorial(a));
		}
	}
}
