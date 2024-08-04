package programAlgorithm;

import java.util.Scanner;

public class SortMQH {
	
	public static void conquer(int arr[], int si, int ei, int mid) {
		int merged[] = new int[ei-si+1];
		
		int indx1 = si;
		int indx2 = mid+1;
		int x =0;
		
		while(indx1 <= mid && indx2 <= ei) {
			if(arr[indx1] <= arr[indx2]) {
				merged[x++] = arr[indx1++];
			}else {
				merged[x++] = arr[indx2];
			}
	
		}
		while(indx1 <= mid) {
			merged[x++] = arr[indx1++];
		}
		
		while(indx2 <= ei) {
			merged[x++] = arr[indx2++];
		}
			
		for(int i =0, j=si; i<merged.length; i++, j++) {   
			arr[j] = merged[i];
		
		}
	}
	
	
	public static void divide(int arr[], int si, int ei) {
		if(si >= ei) return;
		
		int mid = si + (ei-si)/2;
		divide(arr, si, mid);
		divide(arr, mid+1, ei);
		conquer(arr, si, mid, ei);
	}
	
	
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Size");
//		SortMQH s = new SortMQH();
//		int size;
//		size = sc.nextInt();
//		int arr[] = new int[size];
//		for(int i=0; i<size; i++) {
//			arr[i]=sc.nextInt();
//		}
//		s.divide(arr, 0, size-1);
//		
//		for(int i=0; i<size; i++) {
//			System.out.println(arr[i]);
//		}
		
		int arr[] = {80,15,6,30,30,100,11};
		int n = arr.length;
		
		divide(arr, 0, n-1);
		
		for(int i =0; i<n; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println();
	}

}
