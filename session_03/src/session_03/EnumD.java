package session_03;
public class EnumD {	
	public enum Coffee{SMALL(30),MEDIUM(45),LARGE(60);
		
		int price;
		
		Coffee(int price)
		{
			this.price = price;
		}
		
		public int getPrice()
		{
			return price;
		}
		
	};
	
	public static void main(String[] args) {
		
		Coffee c = Coffee.MEDIUM;
		System.out.println(c+" size coffee costs Rs. "+c.getPrice());		
	}
}
