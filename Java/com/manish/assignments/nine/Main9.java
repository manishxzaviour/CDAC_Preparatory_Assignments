//============================================================================
// Name        : two
// Author      : Manish Patil
// Version     : 1.0
// Copyright   : MIT lisence
// Description : Program to convert decimal numbers to binary octal and hexa equiv
//============================================================================

package com.manish.assignments.nine;

import java.util.Scanner;

public class Main9 {
	public static void main(String args[]) {
		
		System.out.println("Enter integer number");
		
		Scanner s=new Scanner(System.in);
		int input=s.nextInt();
		
		System.out.println("\necho input: "+input);
		
		System.out.println("decimal: "+input);
		System.out.println("binary: "+Integer.toBinaryString(input));
		System.out.println("octal: "+Integer.toOctalString(input));
		System.out.println("hexadecimal: "+Integer.toHexString(input));
	}
}
