
package com.manish.assignments.three;

import java.util.Arrays;

public class Fib {
	
	public static void printFib(int n){
		
		int[][] series=Fib.getFib(n);
		
		if(series==null)
			System.out.println("!insuffisient length!");
		
		else {
			
			// [[0,0],[0,1],[1,2],[2,3],[3,5],[5,8]]
			System.out.print("\n[");
			
			for(int[] a:series)
				System.out.print(Arrays.toString(a)+", ");
			System.out.print("]\n");
			
			// 0 1 1 2 3 5 8
//			int[][] series=Fib.getFib(n-1);
//
//			for(int[] a:series)
//				if(a[1]==1)
//					System.out.print(a[1]+" "+a[1]+" ");
//				else System.out.print(a[1]+" ");
		}
		
	}
	
	public static int[][] getFib(int n){
		
		if(n<3)
			return null;
		
		int series[][] = new int[n][2];
		
		// [[0,0],[0,1],[1,2],[2,3],[3,5],[5,8]]
		series[0][0]=series[0][1]=series[1][0]=0;
		series[1][1]=series[2][0]=1;
		series[2][1]=2;
		
		for(int i=3;i<series.length;i++) {
			series[i][0]=series[i-1][1];
			series[i][1]=series[i-1][0]+series[i-1][1];
		}
		return series;
	}
	
}
