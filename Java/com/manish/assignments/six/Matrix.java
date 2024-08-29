package com.manish.assignments.six;

public class Matrix {
	//2D
	private int m;
	private int n;
	public double[][] matrix;
	
	Matrix(int m,int n){
		this.m=m;
		this.n=n;
		this.matrix=new double[m][n]; 	 		
	}
	
	public int getM() {return this.m;}
	public int getN() {return this.n;}
	
 	public static Matrix matMult(Matrix A,Matrix B) {
 		if(A.getN()==B.getM()) {
 			Matrix ans = new Matrix(A.getM(),B.getN());
 			for(int i=0;i<A.getM();i++)
 				for(int j=0;j<B.getN();j++) {
 					double temp=0;
 					for(int k=0;k<A	.getN();k++)
 						temp+=A.matrix[i][k]*B.matrix[k][j];
 					
 					ans.matrix[i][j]=temp;
 				}
 			return ans;
 		}
 		System.out.printf("\n!Cannot multiply given matrices!"
 				+ "\nn1!=m2"
 				+ "\n(mxn)1>%1dx%2d (mxn)2>%3dx%4d",A.getM(),A.getN(),B.getM(),B.getN());
 		return new Matrix(0,0);
	}
 	
 	public void print() {
 		System.out.print("\n[\n");
 		for(int i=0;i<(this.m);i++){
 			System.out.print("[ ");
 				for(int j=0;j<this.n;j++)
 					System.out.printf("%1l %2s",this.matrix[i][j],", ");
 				System.out.print("],\n");
 			}
 		System.out.print("]\n");

 	}
 	
 	//not used intended for |A| 
 	public double[][] getSubMatrix(int m1,int n1,int m2,int n2){
		
		int startM=Math.min(m1, m2);
		int startN=Math.min(n1,n2);
		int endM=Math.max(m1,m2);
		int endN=Math.max(n1,n2);
		
		double[][] temp=new double[startM-endM][startN-endN];
		
		for(int i=startM;i<=endM;i++)
			for(int j=startN;j<=endN;j++)
				temp[i-startM][j-startN]=this.matrix[i][j];
		return temp;
	}
}
