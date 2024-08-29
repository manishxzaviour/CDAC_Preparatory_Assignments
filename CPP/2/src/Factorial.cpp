/*
 * Factorial.cpp
 *
 *  Created on: 16-Aug-2024
 *      Author: Manish Patil
 */

#include "Factorial.h"

double Factorial::getFactorial(int n){
	if(n==0||n==1)
		return 1;
	double d;
	for(d=n;n>0;d*=n--);
	return d;
}
