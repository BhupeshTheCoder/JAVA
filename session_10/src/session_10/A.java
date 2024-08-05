package session_10;

public class A implements HelloWorldInterface{

	@Override
	public String sayHelloWorld() {
		// TODO Auto-generated method stub
		return "Hello World!!";
	}
	
	public static void main(String[] args) {
		
		A a = new A();
		a.sayHelloWorld();
		
	}
	

}
