//============================================================================
// Name        : fourteen.cpp
// Author      : Manish Patil
// Version     : 1.0
// Copyright   : MIT lisence
// Description : check input for palendrome
//============================================================================

#include<iostream>
using namespace std;

int main(int l,char* arg1,char** arg2){
	cout<<"Enter string to be evaluated to check for Palendrome"<<"\n"
			<<"IS Case sensitivity"<<"\n";
	string input;
	cin>>input;

	bool flag=true;
	for(unsigned int i=0;i<input.length()/2;i++){
		if(input[i]!=input[input.length()-1-i]){
			cout<<"String "<<input<<" IS NOT a Palendrome";
			flag=false;
			break;
		}

	}
	if(flag)
		cout<<"String "<<input<<" IS a Palendrome";

	return 0;
}
