package session_03;

public class EnumDemo {
	
	public enum Seasons{SUMMER,WINTER,AUTUMN,SPRING};
	
	public static void main(String[] args) {
		
		Seasons s = Seasons.AUTUMN;
		System.out.println(s);
		
		for(Seasons s1:Seasons.values())
		{
			System.out.println(s1+" "+s1.ordinal());
		}
		
	}

}
