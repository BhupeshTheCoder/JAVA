package pack1;

public interface IncByFive {

	public int IncByFive(int a); 
		default int getNo() {
			return 10;
		}
		public static  String getString() {
			return "ab";
		
	}
}
