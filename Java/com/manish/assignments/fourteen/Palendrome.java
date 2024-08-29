package com.manish.assignments.fourteen;

public class Palendrome {
	public static boolean isPalendrome(String inputS) {
		
		inputS=inputS.toLowerCase();
		char[] inputC=inputS.toCharArray();
		
		if(inputC.length<2)
			return false;
		
		int m=inputC.length/2;
		for(int i=0;i<m;i++)
			if(inputC[i]!=inputC[inputC.length-i-1])
				return false;
		return true;
	}
	
}
