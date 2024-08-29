/*
 * Student.h
 *
 *  Created on: 17-Aug-2024
 *      Author: Manish Patil
 */

#ifndef STUDENT_H_
#define STUDENT_H_

#include<string>
using namespace std;

struct StudentD{
	string firstName;
	string lastName;
	int roll;
	int fMarks;
};
void newStudent(StudentD* s,string firstName, string lastName, int roll, int fMarks);
string getName(StudentD* s);
int getRoll(StudentD* s);
int getFMarks(StudentD* s);

#endif /* STUDENT_H_ */
