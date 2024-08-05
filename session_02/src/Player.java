public class Player {
	
	private String name, country;
	
	public Player()
	{
		this("Dhoni");
		country = "India";
	}
	
	public Player(String name)
	{
		//this();
		this.name = name;
	}

	
	public String toString() {
		return "Player [name=" + name + ", country=" + country + "]";
	}
	
	public static void main(String[] args) {
		
		Player p1 = new Player();
		System.out.println(p1);
		/*
		 * Player p2 = new Player("Virat"); System.out.println(p2);
		 */
	
		
	}

}
