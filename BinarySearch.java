package com.demo;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int arr[]= {3,19,21,16,5,6,12,8,15};
		int key =19;
	
		int res=findkeyValue(arr,key);
		System.out.println(res);
	}

	private static int findkeyValue(int[] arr, int key) {
		Arrays.sort(arr);
		// for(int i=0;i<arr.length;i++)
		// {
		// 	System.out.println(arr[i]);
		// }
		int low=0;
		int high=arr.length-1;
		int mid=0;
		while(low <=high)
		{
			mid=(low+high)/2;
			if(key==arr[mid])
			{
				return mid;
			}
			else if(key<arr[mid])
			{
				high=mid-1;
			}
			else
			{
				low=mid+1;
			}
		}
		
		return -1;
	}

}
