package com.manish.assignments.nine;

import java.util.Arrays;

import com.manish.assignments.one.Parser1;

//unfinished ROUGH and not used
public class Binary {
	private boolean sign;
	private boolean[] exp;
	private boolean[] mantissa;
	private boolean[] simpleBinary;
	private int bias;
	Binary(String input) {
		
		//(-1)^s x m x b^e  m<\b\
		// bias (2^(n-1) – 1), n no of bits for e
		//7.5 0111.0101 > (-1)^0*1.110101*2^2
		//using double precession exp=>11b mantissa 53-1
		
		char[] inputC=input.toCharArray();
		this.sign=(inputC[0]=='-');
		this.exp=new boolean[11];
		this.mantissa=new boolean[53];
		this.bias=(int) (Math.pow(2, 10)-1);
		
		char[] character=input.substring(
							(this.sign)?1:0,
							(input.indexOf('.')==-1)?input.length():input.indexOf('.')
						).toCharArray();
		char[] mantissaT=input.substring(
				(input.indexOf('.')==-1)?input.length():input.indexOf('.')+1,
				input.length()
			).toCharArray();
		
		boolean[] tempSignificant=
				toBinary((String.copyValueOf(character)+String.copyValueOf(mantissaT)).toCharArray());
		System.out.print(Arrays.toString(tempSignificant));
		
	}
	public static boolean[] toBinary(char[] input) {
		boolean[] temp1=new boolean[64];
		String tempI="";
		
		for(char c:input)
			tempI+=c;
		int n=Parser1.toInt(tempI);
		int i=0;
		while(n>0) {
			temp1[i]=(n%2==0)?false:true;
			n/=2;
			i++;
		}
		boolean[] temp2=new boolean[i];
		for (int j = i - 1; j >= 0; j--)
            temp2[i-1-j]=temp1[j];
		return temp2;
	}

}
