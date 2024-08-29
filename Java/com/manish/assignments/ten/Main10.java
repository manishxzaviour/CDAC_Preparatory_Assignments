//============================================================================
// Name        : ten
// Author      : Manish Patil
// Version     : 1.0
// Copyright   : MIT lisence
// Description : Program to accept 10 names of size 50; sort and print them
//============================================================================

package com.manish.assignments.ten;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main10 {
	public static void main(String args[]) {
		//10 names 50 char
		List<String> nameOfStudents=new ArrayList<>();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter names to be sorted <one by one>\n^Z when done");
		
		while(s.hasNextLine()) {
			String temp=s.nextLine();
			if(temp.length()<50)
				nameOfStudents.add(temp);
			else
				System.out.println(
						"invalid input!\n"+
						"Max allowed no if characters cannot excede 50!\n"+
						"Please re-enter\n"
						);
			}
		System.out.println("echo input:\n["+nameOfStudents.stream().collect(Collectors.joining(", "))+']');
		System.out.println("Sorted names:\n["+nameOfStudents.stream().sorted().collect(Collectors.joining(", "))+']');
	}
}
