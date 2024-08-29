//============================================================================
// Name        : five.cpp
// Author      : Manish Patil
// Version     : 1.0
// Copyright   : MIT lisence
// Description : check input characters for uppercase, lowercase ,number of digits and other characters
//============================================================================

#include<iostream>
using namespace std;

int main(int l,char* args[]){
	char a;
	cout<<"Enter character to be evaluated\n";
	cin>>a;
	cout<<"Echo : "<<a<<"\n";
	cout<<"Entered character is a ";
	if(a>47&&a<58)
		cout<<"digit";
	else if(a>64&&a<91)
		cout<<"capital alphabet";
	else if(a>96&&a<123)
		cout<<"small alphabet";
	else
		cout<<"special character";

	cout<<": "<<a<<" with ascii index "<<(int)a;

	return 0;
}
