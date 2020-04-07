package com.dataStructure.recursion;
public class PatternEX1 {
	public static void main(String[] args) {
		pattern(9);
	}
	public static void pattern(int n) {
		int k=0;
		int mid =n/2;
		for(int i=0;i<n;i++) {
			if(i > mid) 
				k--;
			else 
				k++;
			for(int j=0;j<k;j++) {
				System.out.print(" & ");
			}
			System.out.println(); 
		}
	}
}
