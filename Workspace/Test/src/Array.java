import java.util.Scanner;

public class Array {
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int []ar = new int[] {6, 7, 8, 9, 10};
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter size of an array=");
		int size = s.nextInt();
		int[] a = new int [size];
		System.out.println("Enter"+size+"elements= ");
		
		for(int i =0;i<a.length;i++) {
			a[i] = s.nextInt();
		}
		System.out.println("Array Elements are as Follows ");
		for(int i:a) {
			System.out.println("\t"+i);
		}
	}

}
