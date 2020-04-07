package com.dataStructure;

public class BinarySearchRecursion {
	public static int binarySearchDemo(int a[],int findNo,int start,int end) {

		if(start>end) {
			return -11;
		}
		int mid = start+(end-start)/2;
		if(a[mid]==findNo)
			return mid;
		else if(a[mid]<findNo) {
			//start =mid+1;
			binarySearchDemo(a,findNo,mid+1,end);
		}
		else if(a[mid]>findNo) {
			//end =mid-1;
			binarySearchDemo(a,findNo,start,mid-1);
		}
		return -11;
	}
	
	public static int binarySearchNormal(int a[],int findNo,int start,int end) {
		int mid=0;
		boolean flag=false;
		while(start <= end) {
			//mid = (start+end)/2;
			mid = start + ((end-start)/2);
			if(a[mid]==findNo) {
				flag=true;
				break;
			}else if(a[mid] < findNo) {
				start = mid+1;
			}else if(a[mid]>findNo) {
				end =mid-1;
			}
		}
		if(flag)
			return mid;
		else
			return -11;
	
		
	}
	
	public static void main(String[] args) {
		int a[]= {0,1,2,3,4,5,6,7,8,9,10};
//		/System.out.println(binarySearchDemo(a,11,0,a.length));
		//System.out.println(binarySearchNormal(a,11,0,a.length-1));
	System.out.println(binarySearchDemo(a,1,0,a.length-1));
	}

}
