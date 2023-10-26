package com.sunbeam;

import java.util.Scanner;

public class Non_Repeating {

	public static int Non_repeat(int arr[] ) {
		
		for(int i = 0; i<arr.length; i++) {
			int count=0;
			for (int j=0; j<arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			  if (count == 1) {
	                return arr[i];
	            }
	
	}
		return -1;
	}
	public static void main(String[] args) {
		int arr []={ 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		
	
		
		 int result = Non_repeat(arr);
		 
		 if(result != -1) {
			 System.out.println(result);
			 
		 }else {
			 System.out.println("repeating element");
		 }
	}
	

}