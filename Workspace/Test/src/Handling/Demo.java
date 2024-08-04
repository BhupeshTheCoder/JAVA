package Handling;

public class Demo {

	public static void getMessage() {
		int no =10/0;
		System.out.println("No: "+no);
	}
	
	public static void getMsg() {
		getMessage();
	}
	
	public static void main(String[] args) {
		getMsg();
	}
}
