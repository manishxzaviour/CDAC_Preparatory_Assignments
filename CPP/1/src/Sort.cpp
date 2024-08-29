/*
 * Sort.cpp
 *
 *  Created on: 16-Aug-2024
 *      Author: Manish Patil
 */

#include "Sort.h"


vector<double>& Sort::qSort(vector<double>& arr,int lo,int hi){
		if(lo<hi){
			int splitPoint=Sort::split(arr,lo,hi);
			Sort::qSort(arr,lo,splitPoint-1);
			Sort::qSort(arr,splitPoint+1,hi);
		}
		return arr;
};

int Sort::split(vector<double>& arr, int lo,int hi){
	double pivot=arr[hi];
	int i=lo;

	for(int j=lo;j<hi;j++){
		if(arr[j]<=pivot){
			swap(arr,i,j);
			i++;
		}
	}

	swap(arr,i,hi);

	return i;

}

void Sort::swap(vector<double>& arr, int i,int j){
	double temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
}

double Sort::qSortGetMax(vector<double>& arr,int lo,int hi){
	return Sort::qSort(arr,lo,hi)[hi];
}

