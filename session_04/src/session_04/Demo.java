package session_04;
public class Demo extends FactDemo implements StatCal,CompCal{

	@Override
	public void add(int a, int b) {
		System.out.println("Addition = "+(a+b));
	}

	@Override
	public void sub(int a, int b) {
		System.out.println("Substraction = "+(a-b));
	}

	@Override
	public int max(int a, int b) {
		int m = (a>b)?a:b;
		return m;
	}

	@Override
	public void avg(int a, int b) {
		int avg = (a+b)/2;
		System.out.println("Average = "+avg);
		
	}
}
