import java.awt.Rectangle;

public class Map {
	private final int WID_DIMENSION;
	private final int LN_DIMENSION;
	private int scale;
	private Rectangle[][] map;

	public Map(int scale, int wid, int len) {
		this.WID_DIMENSION = wid;// how many rectangles in width
		this.LN_DIMENSION = len;// how many retcangles in height
		map = new Rectangle[this.LN_DIMENSION][this.WID_DIMENSION];
		this.scale = scale;
		fill();
	}

	private void fill() {
		for (int r = 0; r < map.length; r++) {
			for (int c = 0; c < map[r].length; c++) {
				// code IG
			}
		}
	}
	// hey kidz this is the map class I created
	// make sure whenever you log on to eclipse, pull first to check for changes
}
