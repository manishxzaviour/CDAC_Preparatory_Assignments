/*
 * Mult.cpp
 *
 *  Created on: 18-Aug-2024
 *      Author: Manish Patil
 */

#include "Mult.h"

Mat* Mat::mult2D(Mat& A, Mat& B){
	if(A.n!=B.m){
		cout<<"Invalid input size for matrix";
		return 0;
	}
	Mat* C= (Mat*)malloc(sizeof(Mat));
	C->m=A.m;
	C->n=B.n;
	C->mat=(double*)malloc(A.m*B.n*sizeof(double));
	for(int i=0;i<A.m;i++)
		for(int j=0;j<B.n;j++){
			double temp=0;
			for(int k=0;k<B.m;k++){
				temp+=(*A.get(i,k)) * (*B.get(k,j));
			}
			*(C->get(i,j))=temp;
		}
	return C;
}

Mat::Mat(int m, int n){
	this->m=m;
	this->n=n;
	this->mat=(double*)malloc(m*n*sizeof(double));
	//row major/
}

double* Mat::get(int m,int n){
	if(m<(this->m)&&n<(this->n)&&(m>-1)&&(n>-1))
		return this->mat+m*this->m+n;
	return 0;
}

Mat::~Mat(){
	free(this->mat);
}

void Mat::setE(double d,int m,int n){
	if(m<this->m&&n<this->n)
		*(this->get(m,n))=d;
}

void Mat::dump(){
	cout<<"\n[\n";
	for(int i=0;i<(this->m);i++){
			cout<<"[ ";
			for(int j=0;j<this->n;j++)
				cout<<*(this->get(i,j))<<", ";
			cout<<"],\n";
		}
		cout<<"]\n";
}

