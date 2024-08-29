//============================================================================
// Name        : fifteen
// Author      : Manish Patil
// Version     : 1.0
// Copyright   : MIT lisence
// Description : Program to count occurences of each alphabet case insensitive
//============================================================================

package com.manish.assignments.fifteen;

import java.util.Scanner;

import com.manish.assignments.five.Count;

public class Main15 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter string to be parsed");
		
		char[] a=s.nextLine().toUpperCase().toCharArray();
		
		int[] cCount=Count.countChars(a);
		
		System.out.println("\n The input string %1s has following Alphabets:");
		
		for(int i=65;i<65+26+1;i++) {
			System.out.printf("%1c > %1d\n",i,cCount[i]);
		}
	}

}
