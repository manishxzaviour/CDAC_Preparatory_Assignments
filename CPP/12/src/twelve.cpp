//============================================================================
// Name        : twelve.cpp
// Author      : Manish Patil
// Version     : 1.0
// Copyright   : MIT lisence
// Description : reverse given string
//============================================================================

#include<iostream>
using namespace std;

int main(int l,char* arg1,char** arg2){
	string s;
	cout<<"Enter string to be reversed\n";
	cin>>s;
	cout<<"Echo: "<<s<<"\n";

	char rev[s.length()];
	for(int i=0;i<s.length();i++)
		rev[i]=s[s.length()-1-i];

	cout<<"Reverse string of "<<s<<" is ";
	for(int i=0;i<s.length();i++)
		cout<<rev[i];

	return 0;
}
