//============================================================================
// Name        : one.cpp
// Author      : Manish Patil
// Version     : 1.0
// Copyright   : MIT lisence
// Description : find max from given list of numbers
//============================================================================

#include"Sort.h"


int main(int argc, char *argv[], char *env[]) {

	cout<<"Enter the numbers in dataset one by one below \n";
	cout<<"^Z when done\n";
	double a;
	vector<double> buff;
	while(cin>>a){
		buff.push_back(a);
	}

	cout<<"Largest real number from given data set is: "<<	Sort::qSortGetMax(buff,0,buff.size()-1);

	return 0;
}
