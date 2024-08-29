//============================================================================
// Name        : ten.cpp
// Author      : Manish Patil
// Version     : 1.0
// Copyright   : MIT lisence
// Description : get 10 names stor them in array name length 50
//               sort array and display back
//============================================================================

#include<iostream>
#include<string>
#include <cstdlib>
#include <cstring>

using namespace std;

int compare(const void* a, const void* b)
{
	const int* x = (int*) a;
	const int* y = (int*) b;

	if (*x > *y)
		return 1;
	else if (*x < *y)
		return -1;

	return 0;
}

int main(int l, char* argsv[]){

	static char nameOfStudent[10][50];

	cout<<"Enter student names one by one"<<"\n";
	cout<<"10 names [max length 50]"<<"\n";

	for(int i=0;i<10;i++){
		string t;
		cout<<"\nName "<<i<<" :";
		cin>>t;
		if(t.length()<50)
			for(int j=0;j<t.length();j++)
				nameOfStudent[i][j]=t[j];
		else{
			cout<<"\n Max length exceeded! RE-ENTER:";
			cin>>t;
		}
	}

	cout<<"\nEcho input: ";
	for(int i=0;i<10;i++){
		cout<<nameOfStudent[i]<<", ";
	}

	qsort(nameOfStudent,10,50,compare);

	cout<<"\nSorted :";
	for(int i=0;i<10;i++){
			cout<<nameOfStudent[i]<<", ";
		}
	return 0;
}
