//============================================================================
// Name        : fourteen
// Author      : Manish Patil
// Version     : 1.0
// Copyright   : MIT lisence
// Description : Program to check input string to be a palendrome
//============================================================================

package com.manish.assignments.fourteen;

import java.util.Scanner;

public class Main14 {
	public static void main(String args[]) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter string that is to be checked");
		String input=s.nextLine();
		System.out.printf("\necho input: %s\n",input);
		boolean isPalendrome = Palendrome.isPalendrome(input);
		
		System.out.printf("\nthe given input is %s a palendrome",
				(isPalendrome)?"IS":"IS NOT");
	}
}
