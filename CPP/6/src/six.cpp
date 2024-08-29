//============================================================================
// Name        : six.cpp
// Author      : Manish Patil
// Version     : 2
// Copyright   : MIT lisence
// Description : perform matrix multiplication
//============================================================================

#include "Mult.h"

int main(int l, char* argsv[]){


	Mat A=Mat(1,2);
	Mat B=Mat(2,1);

	A.setE(1,0,0);
	A.setE(2,0,1);
	B.setE(1,0,0);
	B.setE(2,1,0);

	A.dump();
	cout<<" X ";
	B.dump();
	cout<<" = ";
	Mat::mult2D(A,B)->dump();
	return 0;
}
