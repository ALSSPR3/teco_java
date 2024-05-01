package useful.ch04;

public class Player {

	private static Player player;
	
	private Player() {
		
	}
	
	public static Player getInstance() {
		if (player == null) {
			player = new Player();
		}
		return player;
	}
}
