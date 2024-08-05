package session_03;
public class ArrayD {
	
	public static void main(String[] args) {
		
		int arr[][] = new int[2][3];
		arr[0][0] = 11;
		arr[0][1] = 12;
		arr[0][2] = 13;
		arr[1][0] = 14;
		
		int [][]a = {{1,2,3},{2,3},{5,7}};
		
		int[][] b = new int[][]{{1,2,3},{2,3},{5,7}};
		
		System.out.println("Array elements are : ");
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("Array Elements: ");
		for(int i[]:a)
		{
			for(int j:i)
			{
				System.out.print(j+"\t");
			}
			System.out.println();
		}
		
	}
}


/*
 * 1 2 3 2 3 5 7
 */
