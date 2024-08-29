/*
 * Emloyee.cpp
 *
 *  Created on: 17-Aug-2024
 *      Author: Manish patil
 */

#include "Employee.h"

Employee newEmployee(string fName,string lName, double salary){
	Employee t;
	t.fName=fName;
	t.lName=lName;
	t.salary=salary;
	return t;
}

void setSalary(Employee* e,double salary){
	e->salary=salary;
}
void empDisplay(Employee* e){
	cout<<"Employee "<<e->fName<<" "<<e->lName<<" has salary "<<e->salary;
}
