package com.DSA.BinarySearch.Algorithm.problems;

public class mountainArray_Search {
	
	public static void main(String args[]) {
		
		System.out.println(search(new int[] {10,20,30,40,50,30,20,5}, 5));
		
	}

	static int search(int[] arr, int target) {
		
		
		int peak = findPeak(arr);
		int ans=-1;
		ans = orgerDiagnosticSearch(arr,target, 0,peak);
		return (ans ==-1)? orgerDiagnosticSearch(arr,target, peak+1,arr.length-1): ans;
	}
	
	static int findPeak(int[] arr) {
		
		int start=0;
		int end = arr.length-1;
		
		while(start< end) {
			
			int mid=  start+ (end-start)/2;
			
			if(arr[mid]> arr[mid+1])
				end= mid;				
			else
				start= mid+1;		
			
		}
		
		return start;
	}
	
	
	static int orgerDiagnosticSearch(int[] arr, int target, int start, int end) {
		
		
		boolean ascendingArray = (arr[0]<arr[arr.length-1]);
		while(start<= end) {
			
			int mid=  start+ (end-start)/2;
			
			if(arr[mid]== target)
				return mid;
			
			else if(arr[mid]> target) {
				if(ascendingArray) {
					end= mid-1;
				}else
				{
					start= mid+1;
					
				}
				
			}
			else {
				
				if(ascendingArray) {
					start= mid+1;
				
				}
				else {
					end=mid-1;
				}
			}
				
		}
		return -1;
	}
}
