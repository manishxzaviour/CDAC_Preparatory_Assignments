/*
 * Subject->cpp
 *
 *  Created on: 18-Aug-2024
 *      Author: Manish Patil
 */

#include "Subject.h"

Subject::Subject(string name,int marks) {
	this->name=name;
	this->marks=marks;
	if(this->marks>=60) {
				this->grade="C";
				if(this->marks>=70) {
					this->grade="B";
					if(this->marks>=80) {
						this->grade="A";
						if(this->marks>=90) {
							this->grade="Ex";
						}
					}
				}
			}
}

string Subject::getName(){return this->name;}
int Subject::getMarks(){return this->marks;}
string Subject::getGrade(){return this->grade;}



