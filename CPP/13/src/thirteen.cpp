//============================================================================
// Name        : thirteen.cpp
// Author      : Manish Patil
// Version     : 1.0
// Copyright   : MIT lisence
// Description : display duplicated strings
//============================================================================

#include<iostream>
#include<cstring>
using namespace std;

int main(int l, char* arg1,char** arg2){
	//display duplicated strings
	//using strcmp()
	const char* input[6]={"manish","Patil","manish","Patil","Name","Manish"};
	bool flag[6]={0,0,0,0,0,0};

	for(int i=0;i<6;i++){
		for(int j=0;j<6;j++){
			if(strcmp(input[i],input[j])==0&&i!=j&&!flag[j]){
				cout<<"String "<<input[i]<<" has a DULIATE in given dataset\n";
				flag[i]=1;
			}
		}
	}

	return 0;
}
