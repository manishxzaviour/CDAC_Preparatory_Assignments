/*
 * NumberSystem.cpp
 *
 *  Created on: 17-Aug-2024
 *      Author: Manish patil
 */

#include "NumberSystem.h"
#include<algorithm>

string toBinary(int n){
	string b="";
	bool sign=0;

	if(n<0){
		sign=1;
		n=abs(n);
	}

	while(n>0){
		b.append((n&1)==1?"1":"0");
		n=n>>1;
	}

	if(sign){
		//padding
		for(int i=b.length();i<sizeof(int)*8;i++)
			b.append("0");

		//twos complement
		for(int i=b.find_first_of('1')+1;i<b.length();i++)
			b[i]=(b[i]=='0')?'1':'0';
	}

	b.append("b0");
	reverse(b.begin(),b.end());
	return b;
}

string toOctal(int n){
	string o="";
	bool sign=0;

	if(n<0){
			sign=1;
			n=abs(n);
	}

	while(n>0){
		o.append(to_string(n%8));
		n=n/8;
	}


	o.append("0");
	if(sign) o.append("-");
	reverse(o.begin(),o.end());
	return o;
}

string toHexa(int n){
	string x="";
	bool sign;

	if(n<0){
				sign=1;
				n=abs(n);
		}

	while(n>0){
			int r=n%16;
			string t;
			if(r<10)
				x.append(to_string(r));
			else{
				switch(r){
				case 10:
					t="A";
					break;
				case 11:
					t="B";
					break;
				case 12:
					t="C";
					break;
				case 13:
					t="D";
					break;
				case 14:
					t="E";
					break;
				case 15:
					t="F";
					break;
				}
				x.append(t);
			}
			n=n/16;
		}

		x.append("x0");
		if(sign) x.append("-");
		reverse(x.begin(),x.end());

	return x;
}
