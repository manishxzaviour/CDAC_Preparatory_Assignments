//============================================================================
// Name        : nine.cpp
// Author      : Manish Patil
// Version     : 1.0
// Copyright   : MIT lisence
// Description : take integer input and display binary octal and hexa equivalent
//============================================================================

#include "NumberSystem.h"


int main(int l, char* argsv[]){

	int input;
	cout<<"Enter decimal number to represent in other number systems\n";
	cin>>input;
	cout<<"Echo :"<<input<<"\n";

	cout<<"Binary :"<<toBinary(input)<<"\n";

	cout<<"Octal :"<<toOctal(input)<<"\n";


	cout<<"Hexadecimal :"<<toHexa(input)<<"\n";
	return 0;
}
