//============================================================================
// Name        : fifteen.cpp
// Author      : Manish Patil
// Version     : 1.0
// Copyright   : MIT lisence
// Description :count occurance of each alphabet in given string case insensitive 
//============================================================================

#include<iostream>
#include<cstring>
using namespace std;

void parse(int* b,char* s){
	for(int i=0;i<strlen(s);i++){
		b[(int)s[i]-65]++;
	}
}

int main(int l, char* args[]){

	char* s;
	static int count[26];

	cout<<"Enter string to be parsed";
	cin>>s;
	strupr(s);
	cout<<"Echo :"<<s<<"\n";

	cout<<"Alphabet : count \n";

	parse(count, s);

	for(int i=0;i<26;i++)
		cout<<(char)(i+65)<<" > "<<count[i]<<"\n";
	return 0;
}
