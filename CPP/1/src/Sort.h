/*
 * Sort.h
 *
 *  Created on: 16-Aug-2024
 *      Author: Manish Patil
 */

#ifndef SORT_H_
#define SORT_H_

#include <iostream>
#include<vector>
using namespace std;

class Sort {
public:
	static vector<double>& qSort(vector<double>& arr,int lo, int hi);
	static double qSortGetMax(vector<double>& arr,int lo,int hi);
private:
	static int split(vector<double>& arr,int lo, int hi);
	static void swap(vector<double>& arr,int i, int j);
};

#endif /* SORT_H_ */
