package com.sunbeam;

import java.util.Scanner;

public class Linear_Search {
	
	public static int linearSearch(int arr[] , int size , int key , int n) {
		int count=0;
		for (int i = 0; i<size; i++ ) {
			
			if(arr[i] == key)
				count++;
			

			if(count==n)
				return i;
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		int arr [] = {66 , 11 ,33 ,88 , 11, 99, 77 ,88};
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the key :");
		int key = sc.nextInt();
		
		int result =linearSearch(arr, arr.length, key, 2);
		if (result != -1) {
			System.out.println("key found at index :" + result);
		}else {
			System.out.println("-1");
		}
		
 	}

}
