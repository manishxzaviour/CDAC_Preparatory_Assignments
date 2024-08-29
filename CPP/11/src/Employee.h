/*
 * Emloyee.h
 *
 *  Created on: 17-Aug-2024
 *      Author: Manish patil
 */

#ifndef EMPLOYEE_H_
#define EMPLOYEE_H_
#include<string>
#include<iostream>
using namespace std;

struct Employee{
	string fName;
	string lName;
	double salary;
};

Employee newEmployee(string fName,string lName,double salary);
void setSalary(Employee* e,double salary);
void empDisplay(Employee* e);

#endif /* EMPLOYEE_H_ */
