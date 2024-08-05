
public class Date {

	private int dd, mm, yy;

	public void setDd(int d) {
		dd = d;
	}

	public int getDd() {
		return dd;
	}

	public static void main(String[] args) {
		Date d = new Date();
		d.setDd(9);
		/*
		 * int day = d.getDd(); System.out.println("Day= "+day);
		 */
		System.out.println("Day = " + d.getDd());

	}
}
