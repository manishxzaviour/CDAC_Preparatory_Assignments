package com.manish.assignments.twelve;

public class Reverse {
	
	public static String string(String s) {
		
		char[] temp1=s.toCharArray();
		char[] temp2=new char[temp1.length];
		
		for(int i=0;i<temp2.length;i++)
			temp2[i]=temp1[temp1.length-i-1];
		
		return String.copyValueOf(temp2);
	}
}
