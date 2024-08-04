
public class Demo2 {
	
	private int n = 20;
	private static int num = 100;
	
	public void get() {
		int z = 50;
		System.out.println("z = "+z);
	}
	
	public static void main(String[]args) {
		
		Demo2 d = new Demo2();
		
		System.out.println("Int = "+d.n);
		System.out.println("Num = "+Demo2.num);
		d.get();
	}

}
