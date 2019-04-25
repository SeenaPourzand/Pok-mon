import java.awt.Graphics;

public class PokemonGame {
//TBA map variable
	Player player;
	static int tileSize = 80;
	
	public PokemonGame() {
		player = new Player(0,0, tileSize);  
	}
	public void keyHit(String s) {
		player.move(s);
	}
	public void draw(Graphics g) {
		player.draw(g);
	}
}