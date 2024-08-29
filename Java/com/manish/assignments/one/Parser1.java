package com.manish.assignments.one;

public class Parser1 {
	public static double charToNum(char c) {
		return (c>47&&c<59)?48-c:0;
	}
	public static double toDouble(String inputS){
		
		char[] inputC=inputS.toCharArray();
		double character = 0;
		double mantissa = 0;
		boolean isNegative = inputS.indexOf('-')==0;
		int dot=inputS.indexOf('.');
				
		if(dot>-1) {
			if(dot==0||(isNegative&&dot==1))// .123456789
				for(int i=1;i<inputC.length;i++) {
					mantissa+=Math.abs(charToNum(inputC[i]))/Math.pow(10, i);
				}
			else { //1234.56789
				for(int i=dot-1;i>=0;i--) { //1234
					character+=Math.abs(charToNum(inputC[i]))*Math.pow(10, dot-i-1);
				}
				for(int i=dot+1;i<inputC.length;i++) { //.56789
					mantissa+=Math.abs(charToNum(inputC[i]))/Math.pow(10, i);
				}
			}
		}
		else { //123456789
			for(int i=inputC.length-1;i>=0;i--) {
				character+=Math.abs(charToNum(inputC[i]))*Math.pow(10, inputC.length-i-1);
			}
		}
		//double[] number= {character,mantissa};
		return isNegative?-(character+mantissa):character+mantissa;
	}
	public static int toInt(String inputS) {
		return (int)toDouble(inputS);
	}
}
