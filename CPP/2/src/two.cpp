//============================================================================
// Name        : two.cpp
// Author      : Manish Patil
// Version     : 1.0
// Copyright   : MIT lisence
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include "Factorial.h"
using namespace std;

int main() {
	//get factorials of given set of numnbers

	cout<<"Enter numbers to calculate their factorial\n"
			<<"^Z when done\n"
			<<"Input: ";
	int a;
	while(cin>>a){
		cout<<"Factorial of "<<a<<" is "<<Factorial::getFactorial(a)<<"\nInput: ";
	}

	return 0;
}
