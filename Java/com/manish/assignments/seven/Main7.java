//============================================================================
// Name        : seven
// Author      : Manish Patil
// Version     : 1.0
// Copyright   : MIT lisence
// Description : Program to print table
//============================================================================
package com.manish.assignments.seven;

import java.util.Scanner;

public class Main7 {
	public static void main(String args[]) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Input number for which multiplication table to be displayed");
		
		int t=s.nextInt();
		System.out.println("echo input: "+t);
		System.out.print("\n\n");
		System.out.println("table of "+t+" is:\n");
		
		for(int i=1;i<13;i++)
			System.out.printf("%1d x %2d=%3d\n",t,i,t*i);
	}
}
