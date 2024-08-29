//============================================================================
// Name        : eleven.cpp
// Author      : Manish Patil
// Version     : 1.0
// Copyright   : MIT lisence
// Description : employe first name last name and salary
//============================================================================

#include "Employee.h"

int main(int l, char* argsv[]){

	string fn;
	string ln;
	double salary;

	cout<<"Enter employee details\n";
	cout<<"First Name: ";
	cin>>fn;
	cout<<"Echo: "<<fn<<"\n";
	cout<<"Last Name: ";
	cin>>ln;
	cout<<"Echo: "<<ln<<"\n";
	cout<<"Salary: ";
	cin>>salary;
	cout<<"Echo: "<<salary<<"\n";

	Employee e=newEmployee(fn,ln,salary);
	setSalary(&e,salary*1.1); //10% raise
	empDisplay(&e);
	return 0;
}
