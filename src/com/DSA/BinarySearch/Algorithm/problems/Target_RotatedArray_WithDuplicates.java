package com.DSA.BinarySearch.Algorithm.problems;

public class Target_RotatedArray_WithDuplicates {

	public static void main(String args[]) {	
	//System.out.println(findPivot(new int[] {80,90,10,20,30,40,50,60}));
	//System.out.println(findPivot(new int[] {2,2,2,9,2,2,2,2}));
	//System.out.println(findPivot(new int[] {80,80,80,90,90,90,90,10,20,20,30,30,40,50,60}));
	//System.out.println(findPivot(new int[] {2,2,2,1,2,2,2,2,2}));
	//System.out.println(findPivot(new int[] {2,2,2,2,2,2,2,2,2}));
	//System.out.println(search(new int[] {1,0,1,1,1},0));
	//System.out.println(search(new int[] {3,5,1},3));
		System.out.println(search(new int[] {2,2},2));
	}
	
	
	static boolean search(int[] arr, int target) {
		
		int pivot = findPivot(arr);
		if(pivot==-1)
			return false;
		
		if(target== arr[pivot])
			return true;
		
		if(target>=arr[0])
			 return (binarySearch(arr, target, 0 , pivot-1 )==-1)?false:true;
		
		else
			return (binarySearch(arr, target, pivot+1,arr.length-1)==-1)?false:true;
			
		
		
	}
	
	
private static int binarySearch(int[] arr, int target, int start, int end) {
	
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
	
	static int findPivot(int arr[]) {
		
		int start = 0;
		int end= arr.length-1;
		
		while(start<=end) {
			
			int mid = start+ (end-start)/2;
			
			if(mid<end && arr[mid]>arr[mid+1])
				return mid;
			if(mid>start && arr[mid]<arr[mid-1])
				return mid-1;
			
			while((arr[start]== arr[mid]&& arr[mid]==arr[end])&& start<end) {
				
				if(arr[start]>arr[start+1]) {
					return start;
					
				}
					
				start++;
				if(arr[end]<arr[end-1])
					return end-1;
				end--;
				
			}
			// Left is sorted only if
			if(arr[mid]>arr[start] || arr[mid]==arr[start] && arr[mid]>arr[end])
				start = mid+1;
			else
				end=mid-1;
			
		}
		
		return -1;
	}
}
