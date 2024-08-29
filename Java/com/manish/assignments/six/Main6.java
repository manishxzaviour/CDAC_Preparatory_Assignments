//============================================================================
// Name        : six
// Author      : Manish Patil
// Version     : 1.0
// Copyright   : MIT lisence
// Description : Program to perform 2d matrix multiplication
//============================================================================

package com.manish.assignments.six;

import java.util.Arrays;

public class Main6 {

	public static void main(String[] args) {
		Matrix a = new Matrix(1,2);
		Matrix b = new Matrix(2,1);
		a.matrix[0][0]=3;b.matrix[0][0]=6;
		a.matrix[0][1]=7;b.matrix[1][0]=5;
		
		Matrix c = Matrix.matMult(a,b);
		a.print();
		System.out.print(" X ");
		b.print();
		System.out.print(" = ");
		c.print();
	}

}
