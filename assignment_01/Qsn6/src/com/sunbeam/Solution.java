package com.sunbeam;

public class Solution {

	public static int getRank(int [] stream , int x) {
		int rank = 0;
		
		for (int i : stream) {
			if(i <= x) {
				rank++;
			}
			
		}
		
	return rank;	
	}
	
	public static void main(String[] args) {
		int [] stream = {10 , 20 , 15 ,3 , 4 , 4, 1};
		
		int elementtofind = 4;
		
		int rank = getRank(stream, elementtofind);
		
		System.out.println("rank of :" + elementtofind + " < is > :" + rank);
	}
}
