package session_10;

public class HelloWorldLambda
{
	
	public static void main(String[] args) {
		
		/*HelloWorldInterface h = () -> {return "Hello World!!";};
		System.out.println(h.sayHelloWorld());
		
		HelloWorldInterface h1 =()-> "Java Programming";
		System.out.println(h1.sayHelloWorld());*/
		
		/*HelloWorldInterface h = (x) -> x+5;
		System.out.println(h.incrementByFive(4));*/
		
		HelloWorldInterface h = (a,b)-> a+" "+b;
		System.out.println(h.concatString("Infoway", "Technologies"));
		
	}

}
