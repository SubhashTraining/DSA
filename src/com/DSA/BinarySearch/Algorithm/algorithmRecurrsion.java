package com.DSA.BinarySearch.Algorithm;

import java.util.Arrays;

public class algorithmRecurrsion {
	
	
	public static void main(String args[]) {
		int arr[] = {18,878,76378,989,656,909};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(binarySearch(arr, 0, arr.length-1,76378));
		System.out.println(binarySearch(arr, 0, arr.length-1,5));
	}
	
	private static int binarySearch(int arr[],int start, int end, int target) {
		
		while(start<=end) {
			int mid = start+ (end-start)/2;
			if(arr[mid]==target)
				return mid;
			if(arr[mid]> target)
				return binarySearch(arr,start,mid-1, target);
			else 
				return binarySearch(arr,mid+1, end , target);
		}
		return -1;
		
	}
}
