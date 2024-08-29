package com.manish.assignments.two;

public class Factorial {
	public static double getFactorial(int input) {
		input=Math.abs(input);

		if(input==0||input==1) return 1;
		
		int ans=1;
		for(long i=input;i>0;i--)
			ans*=i;
		return ans;
		
//		if(input==0||input==1) return 1;
//		return input*getFactorial(input-1);
	}
}
