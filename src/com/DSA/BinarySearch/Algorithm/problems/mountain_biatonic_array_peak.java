package com.DSA.BinarySearch.Algorithm.problems;


/**
 * 
 * Always look for a failing condition. Here when start == end , thats our peak element
 * 
 *
 */
public class mountain_biatonic_array_peak {
	
	public static void main(String args[]) {
		
		System.out.println(mountainPeak(new int[]{10,20,05}));
		
	}
	
	
	private static int mountainPeak(int[] arr) {
		
		int start = 0;
		int end= arr.length-1;
		//start should be less than end, if start == end thats the peak
		// the loop wont stop
		while(start<end) {
			
			
			int mid = start + (end-start)/2;
			
			if(arr[mid]< arr[mid+1])
			{
				start= mid+1;
			}
			else
				end = mid;
		}
		
		return start;
	}
		
}
