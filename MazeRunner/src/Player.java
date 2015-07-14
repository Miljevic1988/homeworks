import java.awt.Image;

import javax.swing.ImageIcon;

public class Player {

	private int tileX, tileY;
	private Image player;

	/**
	 * Constructor
	 */
	public Player() {

		ImageIcon img = new ImageIcon("res\\img\\smiley.png");
		player = img.getImage();

		tileX = 1;
		tileY = 1;

	}

	/**
	 * Getters and setters.
	 */
	public Image getPlayer() {
		return player;
	}

	public int getTileX() {
		return tileX;
	}

	public int getTileY() {
		return tileY;
	}

	public void setTileX(int tileX) {
		this.tileX += tileX;
	}

	public void setTileY(int tileY) {
		this.tileY += tileY;
	}

	public void setPlayer(Image player) {
		this.player = player;
	}

}
