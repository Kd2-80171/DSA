package com.sunbeam;

public class Solution {
	
	public static int binarySearch(int [] arr , int key) {
		   
		int left = 0;
		int right = arr.length -1;
		
		while(left <= right) {
			int mid = left+(right-left)/2;
			
			if(arr[mid] == key) {
				return mid;
				
			}else if (arr[mid] < key) {
				right = mid -1;
			}else {
				left = mid + 1;
			}
			
		}
		
		return -1;
	}
	
	public static void main(String [] ergs) {
		
		int [] arr = {50 , 43 , 38 , 31 , 26, 18 , 9 , 5 , 1};
		int key = 26;
		
		int result = binarySearch(arr, key);
		if(result != -1) {
			System.out.println("key found at index :" + result);
		}
		else {
			System.out.println("not found");
		}
		
		
		
		
		
		
		
		
	}

}
