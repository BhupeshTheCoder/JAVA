import java.util.Scanner;

public class MathOperation1 {
	
	private int x,y,z;
	
	public int Two(int x , int y) {
		int t = x*y;
		return t;
	}
	
	public float Three(float x, float y, float z) {
		float t = x*y*z;
		return t;
	}
	
	public int Arr(int arr[]) {
		int t =1;
		for(int i =0;i<=arr.length-1;i++) {
			t= t*arr[i];
		}
		return t;
	}
	
	public double Di(double x, int y) {
		double t = x*y;
		return t;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter x: ");
		int x = s.nextInt();
		System.out.print("Enter y: ");
		int y = s.nextInt();
		System.out.print("Enter z: ");
		int z = s.nextInt();
		MathOperation1 m = new MathOperation1();
		System.out.println("Multiple of two is: "+m.Two(x, y));
		System.out.println("Multiple of three is: "+m.Three(x, y, z));
		int arr[]= {1,2,3,4,5};
		System.out.println("Multiple of Array is: "+m.Arr(arr));
		System.out.println("Multiple of one double and int is: "+m.Di(x, y));
	}

//	private String Arr() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
