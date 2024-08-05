public class Addition {

	/*
	 * public void add(int a,int b) { System.out.println("Addition = "+(a+b)); }
	 */

	/*
	 * public int add(int a,int b) { return 0; }//CTE - Signature should be different
	 */

	/*
	 * public int add(int a,int b,int c) { return (a+b+c); }
	 * 
	 * public int add(int a,int b,int c,int d) { return (a+b+c+d); }
	 */

	public int add(String name, int... x) {
		int sum = 0;
		int count = x.length;
		System.out.println("Count = " + count);
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		return sum;
	}

	public static void main(String[] args) {

		Addition a = new Addition();
		int sum = a.add("Rahul", 1, 2, 3);
		System.out.println("Sum = " + sum);
		System.out.println("Add = " + a.add("Vishal", 1, 2, 3, 4, 5, 6, 6));

	}

}

/*
 * varArgs
 * 
 * ...
 * 
 * 
 * public return_type method_name(datatype... var_name) { }
 */
