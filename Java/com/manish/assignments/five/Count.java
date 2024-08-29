package com.manish.assignments.five;

public class Count { 
	
	private char[] input;
	private int digits; 	//(48,57)
	private int upper; 		//(65,90)
	private int lower;		//(97,122)
	private int special;	// spaced between
	private Security security;
	
	Count(char[] input){
		this.input=input;
		int[] cCount=countChars(input);
		
		//count
		for(int i=32;i<255;i++) {
			if(cCount[i-32]!=0&&((i>47&&i<58)))
				this.digits++;
			else if(cCount[i-32]!=0&&((i>64&&i<91)))
				this.upper++;
			else if(cCount[i-32]!=0&&((i>96&&i<123)))
				this.lower++;
			else if(cCount[i-32]!=0
					&&
					((i>31&&i<48)||(i>57&&i<65)||(i>90&&i<97)||(i>122&&i<127)))
				this.special++;
		}
		
		//strength test
		if(this.digits>0||this.upper>0||this.lower>0||this.special>0)
			if(this.digits>0&&this.upper>0&&this.lower>0&&this.special>0)
				if(this.digits>2&&this.upper>2&&this.lower>2&&this.special>2)
					if(this.digits>3||this.upper>3||this.lower>3||this.special>2)
						this.security=Security.strong;
					else this.security=Security.good;
				else this.security=Security.satisfactory;
			else this.security=Security.weak;
		
		
	}
	public Security getSecurity() {return this.security;}
	public int getDigits() {return this.digits;}
	public int getUpper() {return this.upper;}
	public int getLower() {return this.lower;}
	public int getSpecial() {return this.special;}
	public boolean isValidPwd() {
		return (this.security.securityLevel()>0);
	}
	
	public static int[] countChars(char[] input){
		int cCount[];
		cCount=new int[255-32+3];//ASCII 255 -32 (unprintable) + cr,lf,HT
		for(char c:input) {
			cCount[c-32]++;
			}
		return cCount;
	}
}
