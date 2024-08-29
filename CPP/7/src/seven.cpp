//============================================================================
// Name        : seven.cpp
// Author      : Manish Patil
// Version     : 1.0
// Copyright   : MIT lisence
// Description : print table of given number
//============================================================================

#include<iostream>
using namespace std;

int main(int l, char* arg1, char** arg2){
	int a;
	cout<<"Enter number to print table for\n";
	cin>>a;
	cout<<"\n";
	for(int i=1;i<13;i++)
		cout<<a<<" x "<<i<<" = "<<a*i<<"\n";
}
