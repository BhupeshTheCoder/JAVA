public class MyDate {

	private int dd, mm, yy;// instance variables

	public void initDate() {
		dd = mm = yy = 1;
	}

	public void setDate(int d, int m, int y) {
		dd = d;
		mm = m;
		yy = y;
	}

	
	public void displayDate() {
		System.out.println("Date = [" + dd + "/" + mm + "/" + yy + "]");
	}

	public static void main(String[] args) {

		MyDate d;// reference variable
		d = new MyDate();//new keyword - Object Creation
		System.out.println("dd = " + d.dd);
		d.initDate();
		d.displayDate();
		d.setDate(9, 5, 2023);
		d.displayDate();
	}

}
