/*
 * Student.cpp
 *
 *  Created on: 17-Aug-2024
 *      Author: Manish Patil
 */

#include "Student.h"
#include<string>
using namespace std;

void newStudent(StudentD* s,string fn, string ln, int roll, int fM){
	s->firstName=fn;
	s->lastName=ln;
	s->roll=roll;
	s->fMarks=fM;
}

string getName(StudentD* s){
	string name=s->firstName;
	name.append(" ");
	name.append(s->lastName);
	return name;
}

int getRoll(StudentD* s){return s->roll;}
int getFMarks(StudentD* s){return s->fMarks;}
