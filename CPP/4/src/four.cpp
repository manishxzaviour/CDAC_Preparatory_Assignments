//============================================================================
// Name        : four.cpp
// Author      : Manish Patil
// Version     : 1.0
// Copyright   : MIT Lisense
// Description : calculate grade for five subjects;
//============================================================================

#include "Subject.h"

int main(int l, char* args[]){
	Subject sci= Subject("Science",70);
	Subject mat= Subject("Maths",60);
	Subject eng= Subject("English",80);
	Subject hist=Subject("History",75);
	Subject geo=Subject("Geography",90);

	Subject a[5]={sci,mat,eng,hist,geo};

	for(int i=0;i<5;i++)
		cout<<"Student has scored grade '"
			<<a[i].getGrade()<<"' with marks "
			<<a[i].getMarks()<<" in subject "
			<<a[i].getName()<<"\n";
	return 0;
}
