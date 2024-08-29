//============================================================================
// Name        : two
// Author      : Manish Patil
// Version     : 1.0
// Copyright   : MIT lisence
// Description : Program to count characters of ascii table present in input string
//============================================================================

package com.manish.assignments.five;

import java.util.Arrays;

public class Main5 {
	//count upper-case lower-case digits other characters and determine password strength
	public static void main(String[] args) {
		
		//input in cmd args
		char[] input=Arrays.toString(args).toCharArray();
		
		Count pwd=new Count(input);
		
		String temp1="Acceptable";
		String temp2="NOT Acceptable";
		
		System.out.printf("The entered password: %1s has %2s strength",
				Arrays.toString(args),
				pwd.getSecurity().name());
		System.out.printf("\nEntered Password is %1s",(pwd.isValidPwd())?temp1:temp2);
		System.out.printf("\nas it has >"
				+ "\n%1d digit \n%2d Uppercase \n%3d Lowercase \n%4d Special \ncharacters",
							pwd.getDigits(),
							pwd.getUpper(),
							pwd.getLower(),
							pwd.getSpecial());
		
		
		//prints number of each character from ascii table in input string 
/****	
 		int[] cCount=Count.countChars(input);
		String temp1="There is one of ";
		String temp2="\ntwo of ";
		String temp3="\nand  more of ";
		String temp4="\nwhile none of ";
		
		for(int i=0;i<255-32+3;i++) {
			if(cCount[i]!=0) {
				if(cCount[i]==1)
					temp1+=(char)(i+32)+" ";
				else if(cCount[i]==2)
					temp2+=(char)(i+32)+" ";
				else if(cCount[i]>2)
					temp3+=(char)(i+32)+" ";
			}
			else
				temp4+=(char)(i+32)+" ";
			System.out.printf("%1c>%1d\n",i+32,cCount[i]);
		}
		System.out.printf("%1s%2s%3s%4s\n",temp1,temp2,temp3,temp4);
****/
	}
}
