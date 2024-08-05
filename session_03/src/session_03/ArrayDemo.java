package session_03;

public class ArrayDemo {
	public static void main(String args[]) {
		
		int arr[] = new int[5];
		arr[0] = 11;
		arr[2] = 13;
		
		int[] a = {1,2,3,4,5};
		
		int []b = new int[] {1,2,3,4,5};
		
		System.out.println("Array Elements are: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
			
		for(int i:a)
		{
			System.out.println(i);
		}
		
	}
}
