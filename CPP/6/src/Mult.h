/*
 * Mult.h
 *
 *  Created on: 18-Aug-2024
 *      Author: Manish Patil
 */

#ifndef SRC_MULT_H_
#define SRC_MULT_H_

#include<iostream>
using namespace std;

class Mat{
private:
	int m,n;
	double* mat;
public:
	Mat(int m, int n);
	void setE(double d,int m, int n);
	double* get(int m,int n);
	void dump();
	static Mat* mult2D(Mat& A,Mat& B);
	~Mat();
};
#endif /* SRC_MULT_H_ */
