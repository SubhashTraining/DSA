package com.DSA.BinarySearch.Algorithm.problems;

public class floor {


	public static void main(String args[]) {
		
		int[] arr = {6,8,74,98,105,256,454,878};
		System.out.println(calCeiling(arr,5));
		
	}
	//what if the traget is less than the first element of the array
	// When the binary search condition fails , the element should be
	// in between end and start
	
	// so start always returns the first element in the array greater than target
	// end always returns the first element less than target (floor)
	
	private static int calCeiling(int[] arr, int target) {
		
		int start= 0;
		int end = arr.length-1;
		
		while(start<= end) {
			int mid = start + (end-start)/2;
			
			
			if(target<arr[mid])
				end=mid-1;
			else
				start= mid+1;
				
			
		}
		
		return (end<0)?-1:arr[end]; 
		
	}
}
