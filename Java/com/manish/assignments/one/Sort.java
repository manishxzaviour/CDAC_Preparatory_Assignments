package com.manish.assignments.one;

public class Sort {
	//QuickSort
	public static void quickSort(Double[] input,int lo,int hi) {
		if(lo<hi) {
			int splitPoint=split(input,lo,hi);
		    quickSort(input,lo,splitPoint-1);
			quickSort(input,splitPoint+1,hi);
		}
	}
	public static int[] quickSortInt(int[] input,int lo,int hi) {
		Double temp[]=new Double[input.length];
		int temp2[]=new int[input.length];
		
		for(int i=0;i<input.length;i++)
			temp[i]=(double)input[i];
		
		quickSort(temp,0,temp.length-1);
		
		for(int i=0;i<temp.length;i++)
			temp2[i]=(int)(double)temp[i];
		
		return temp2;
		}
	private static int split(Double[] input, int lo, int hi) {
		Double pivot=input[hi]; 
        int i = lo;
        for (int j=lo;j<hi;j++)
        {
            if(input[j]<=pivot)
            {
                swap(input,i,j);
                i++;
            }
        }
        swap(input,i,hi);
        
        return i;
	  }
	private static void swap(Double[] input, int i, int j) {
	    double tmp=input[i];
	    input[i]=input[j];
	    input[j]=tmp;
	  }
	
	//mergeSort is stable sort
	public static void mergeSort(Double[] input,int l, int r) {
		if(l<r) {
			int m=(l+r)/2;
			mergeSort(input,l,m);
			mergeSort(input,m,r);
			merge(input,l,m,r);
		}
	}
	private static void merge(Double[] input,int l,int m,int r) {
		int n1=m-l+1; //size of left
		int n2=r-m; //size of right
		
		Double[] L=new Double[n1];
		Double[] R=new Double[n2];
		
		for (int i=0;i<n1;i++)
            L[i]=input[l+i];
        for (int j=0;j<n2;j++)
            R[j]=input[m+1+j];
    
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                input[k] = L[i];
                i++;
            }
            else {
                input[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] 
        while (i < n1) {
            input[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] 
        while (j < n2) {
            input[k] = R[j];
            j++;
            k++;
        }
        
	}
	public static int[] mergeSortInt(int[] input,int l, int r) {
		Double temp[]=new Double[input.length];
		int temp2[]=new int[input.length];
		
		for(int i=0;i<input.length;i++)
			temp[i]=(double)input[i];
		mergeSort(temp,0,temp.length-1);
		for(int i=0;i<temp.length;i++)
			temp2[i]=(int)(double)temp[i];
		
		return temp2;
	}
	
}
