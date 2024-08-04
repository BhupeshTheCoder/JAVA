
public class Player {

	private String playerName, playerCountry;
	
	public Player() {
		System.out.println("Default Constructor");
		playerCountry= "India";
	}
	
	public Player(String playerName) {
		this();
		System.out.println("Parametrized Constructor");
		this.playerName = playerName;
	}

	
	public String toString() {
		return "Player [playerName=" + playerName + ", playerCountry=" + playerCountry + "]";
	}
	
	public static void main(String[] args) {
		Player p = new Player("Neeraj");
		System.out.println(p);
	}
	
}
