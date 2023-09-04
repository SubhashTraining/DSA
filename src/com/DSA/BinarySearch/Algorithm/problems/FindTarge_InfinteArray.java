package com.DSA.BinarySearch.Algorithm.problems;

import java.util.Arrays;

/*
 * How do you find a given target in a sorted array of infinite sixe
 * when you dont know the size how do we create the array
 * assuming that we dont know the size 
 * we are going to divide the problem into chunks
 * first we take an index of 0,1 and see if target is > index 1
 * true we move to the next chunk 2, end+ (end-start)*2
 * end + box size of the previous chunk *2
 * if the target is less the array[new end], then the target should 
 * lie the chunk
 * apply binary search on this chunk 
 */


public class FindTarge_InfinteArray {
	
	
	
	public static void main(String args[])
	{
		
		int[] arr = new int [500];
		
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i] = i*2;
		}
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println(findTarget(arr,12));
		
	}
	
	//this simplifies the entire problem
	
	private static int findTarget(int[] arr,int target){
		
		int start=0;
		int end = 1;
		
		while(target> arr[end]) {
			int temp = end+1;
			end = end + ((end-start)+1)*2;
			start= temp;
		}
		
		return binarySearch(arr, target, start, end);
			
		}
	
	
	private static int binarySearch(int[] arr, int target, int start, int end) {

		while(start<=end)
		{
			int mid = start+ (end-start)/2;
			if(arr[mid]== target) {
				return mid;
			}
			else if(arr[mid]> target)
				end= mid-1;
			else
				start= mid+1;
		}
		
		return -1;
	}
}
