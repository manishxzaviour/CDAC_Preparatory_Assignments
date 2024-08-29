//============================================================================
// Name        : twelve
// Author      : Manish Patil
// Version     : 1.0
// Copyright   : MIT lisence
// Description : Program to reverse a given string
//============================================================================

package com.manish.assignments.twelve;

import java.util.Scanner;

public class Main12 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string to be reversed");
		
		String input=s.nextLine();
		
		System.out.println("\necho input: "+input);
		System.out.println("reversed string is: "+Reverse.string(input));
	}

}
