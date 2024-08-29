/*
 * Subject.h
 *
 *  Created on: 18-Aug-2024
 *      Author: Manish Patil
 */

#ifndef SUBJECT_H_
#define SUBJECT_H_

#include<iostream>
using namespace std;

class Subject{
private:
	string name;
	int marks;
	string grade;
public:
	Subject(string name, int mark);
	int getMarks();
	string getName();
	string getGrade();
};

#endif /* SUBJECT_H_ */
