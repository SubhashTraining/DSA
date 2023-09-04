package com.DSA.BinarySearch.Algorithm;

import java.util.Arrays;

public class algorithm {
	
	public static final int target = 656;
	
	public static void main(String args[]) {
		int arr[] = {18,878,76378,989,656,909};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(binarySearch(arr, 656));
		
	}
	
	private static int binarySearch(int[] arr, int target) {
		
		int start = 0;
		int end  = arr.length-1;
		
		while(start<=end) {
			
			int mid = start + (end-start)/2;
			if (arr[mid] == target)
				return mid;
			
			else if (arr[mid]>target)
				end = mid-1;
			else
				start=mid+1;
			
		}
		
		return -1;
		
		
	}
}
