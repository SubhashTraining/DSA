package com.DSA.BinarySearch.Algorithm.problems;

public class ceilingCharArray {


	public static void main(String args[]) {
		
		char[] arr = {'c','f','j','t'};
		System.out.println(arr[calCeiling(arr,'t')]);
		
	}
	//what if the traget is greater than the last element of the array
	// When the binary search condition fails , the element should be
	// in between end and start
	
	// so start always returns the first element in the array greater than target
	// end always returns the first element less than target (floor)
	
	private static int calCeiling(char[] arr, char target) {
		
		int start= 0;
		int end = arr.length-1;
		
		while(start<= end) {
			int mid = start + (end-start)/2;		
			
			if(target < arr[mid])
				end=mid-1;
			else
				start= mid+1;
				
			
		}
		
		//very important when start is > arr.length-1 . then start = N(arr.length)
		// so start%N =0 -- if start =12 and N=14 ... start% N = 12
		return  start % arr.length;
		
	}
}
