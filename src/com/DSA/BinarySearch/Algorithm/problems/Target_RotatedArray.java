package com.DSA.BinarySearch.Algorithm.problems;

import java.util.Arrays;

public class Target_RotatedArray {

	public static void main(String args[]) {	
	//System.out.println(findPivoit(new int[] {80,90,10,20,30,40,50,60}));
	//System.out.println(findPivoit(new int[] {2,2,2,9,2,2,2,2}));
	//System.out.println(findPivoit(new int[] {80,80,80,90,90,90,90,10,20,20,30,30,40,50,60}));
	System.out.println(findPivoit(new int[] {2,2,2,1,2,2,2,2,2}));
	}
	
	
	
	
	private static int findPivoit(int arr[]) {
		
		int start =0;
		int end = arr.length-1;
		while(start<=end) {
			
			int mid = start+ (end-start)/2;
			
			if(mid<end && arr[mid]>arr[mid+1])
				return mid;
			
			if(mid >0 && arr[mid]<arr[mid-1])
				return mid-1;
			
		
			
			if(arr[mid]>arr[start])
				start = mid+1;
			else
				end= mid-1;		
			
		}
		
		return -1;
	}

}
