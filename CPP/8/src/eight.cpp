//============================================================================
// Name        : seven.cpp
// Author      : Manish Patil
// Version     : 1.0
// Copyright   : MIT lisence
// Description : create student structure with name roll number and total marks
// 				 read data within the structure
//============================================================================

#include<iostream>
#include<string>
#include "Student.h"
using namespace std;


int main(int l, char* args1,char** args2){

	string fn,ln;
	int roll,fm;

	cout<<"Enter student details below\n";
	cout<<"First Name: ";
	cin>>fn;
	cout<<"echo: "<<fn<<"\n";
	cout<<"Last Name: ";
	cin>>ln;
	cout<<"echo: "<<ln<<"\n";
	cout<<"Roll no: ";
	cin>>roll;
	cout<<"echo: "<<roll<<"\n";
	cout<<"Final Marks: ";
	cin>>fm;
	cout<<"echo: "<<fm<<"\n";

	StudentD s;
	newStudent(&s,fn,ln,roll,fm);
	cout<<"Student "<<getName(&s)
		<<" with roll no:"<<getRoll(&s)
		<<" has scored "<<getFMarks(&s)<<" Marks";
	return 0;
}
