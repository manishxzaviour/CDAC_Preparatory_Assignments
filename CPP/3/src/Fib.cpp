/*
 * Fib.cpp
 *
 *  Created on: 16-Aug-2024
 *      Author: Manish Patil
 */

#include "Fib.h"
#include<iostream>

void Fib::print(int n){
	if(n<2){
		std::cout<<"insuffisient number";
		return;
	}
	int a[n];
	a[0]=0;
	a[1]=1;

	std::cout<<"Fibonachi series with n elements:\n";
	std::cout<<"[0, 1, ";
	for(int i=2;i<n;i++){
		a[i]=a[i-1]+a[i-2];
		std::cout<<a[i]<<", ";
	}
	std::cout<<"]";
}


