
public class Date {
	
	private int d, m , y;
	
	public Date() {}                             //Default constructor

	public Date(int d, int m, int y) {
		super();
		this.d = d;
		this.m = m;
		this.y = y;
	}

	
	public String toString() {
		return "Date [d=" + d + ", m=" + m + ", y=" + y + "]";
	}
	
	
	public static void  swapDates(Date[]d) {
		System.out.println("In Swap Dates");
		Date temp;
		temp = d[0];
		d[1] = d[2];
		d[1] = temp;
	}
	public static void main(String[] args) {
		Date d[] = new Date[2];
		
		Date d1 = new Date (3,5,2024);
		Date d2 = new Date (4,5,2024);
		
		d[0] = d1;
		d[1] = d2;
		
		System.out.println("Before Swapping");
		System.out.println(d[0]);
		System.out.println(d[1]);
		
		Date.swapDates(d);
		System.out.println("After Swapping");
		System.out.println(d[0]);
		System.out.println(d[1]);		
	}
	
}
