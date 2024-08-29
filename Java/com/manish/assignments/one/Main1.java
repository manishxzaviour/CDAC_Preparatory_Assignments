package com.manish.assignments.one;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		System.out.println("To find maximum from given set of real numbers");
		System.out.println("^Z when done");
		System.out.println("Input:");
		
		Double[] buffer=new Double[100];
		int count=0;
		Scanner s=new Scanner(System.in);
		while(s.hasNextDouble()) {
			buffer[count]=s.nextDouble();
			count++;
		}
		Double d[]=new Double[count];
		for(int i=0;i<count;i++)
			d[i]=buffer[i];
		
		System.out.printf("echo input: %s \n",Arrays.toString(d));
		Sort.quickSort(d,0,count-1);
		System.out.printf("\necho sorted input: %s",Arrays.toString(d));
		System.out.printf("\nmaximum real number from given set is : %s",d[d.length-1].toString());
	}
}
