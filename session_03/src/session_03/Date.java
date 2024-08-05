package session_03;

public class Date {
	
	private int d,m,y;

	public Date() {}

	public Date(int d, int m, int y) {
		
		this.d = d;
		this.m = m;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Date [d=" + d + ", m=" + m + ", y=" + y + "]";
	}
	
	
	public static void swapDates(Date d1, Date d2)
	{
		Date temp;
		temp = d1;
		d1 = d2;
		d2 = temp;
		System.out.println("In Swap method------>");
		System.out.println("d1 = "+d1);
		System.out.println("d2 = "+d2);	
	}
		
	public static void main(String[] args) {
		
		Date d1 = new Date(4,5,2022);
		Date d2 = new Date(7,6,2023);
		System.out.println("Before Swapping------>");
		System.out.println("d1 = "+d1);
		System.out.println("d2 = "+d2);
		Date.swapDates(d1, d2);
		System.out.println("After Swapping------>");
		System.out.println("d1 = "+d1);
		System.out.println("d2 = "+d2);	
	}
}
