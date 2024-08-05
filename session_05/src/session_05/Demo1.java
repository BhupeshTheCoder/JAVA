package session_05;

public class Demo1 extends Demo{
	
	public static void main(String[] args) {
		
		PopCorn p = new PopCorn() {
			
			@Override
			public void taste() {
				System.out.println("Salty");
				
			}
		};
		
		p.taste();
		
	}

}
