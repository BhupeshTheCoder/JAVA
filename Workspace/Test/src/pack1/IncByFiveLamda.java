package pack1;

public class IncByFiveLamda {
	public static void main(String[] args) {
		IncByFive i= (x)->{return(x+5);};   //one way to represent lamda
		
		IncByFive h= (x)->(x+10);
		
		System.out.println(i.IncByFive(10));
		
		System.out.println(h.getNo());

	}}
