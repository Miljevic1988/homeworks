import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Board extends JPanel implements KeyListener {

	private static final long serialVersionUID = -229103274055316865L;

	private Map m;
	private Player p;
	
	/**
	 * Constructor
	 */
	public Board() {

		m = new Map();
		p = new Player();
		addKeyListener(this);
		setFocusable(true);

	}
	
	/**
	 * Paint method
	 */
	public void paint(Graphics g) {
		super.paint(g);

		for (int y = 0; y < 21; y++) {
			for (int x = 0; x < 31; x++) {
				if (m.getMap(x, y).equals("g")) {
					g.drawImage(m.getGrass(), x * 32, y * 32, null);
				}
				if (m.getMap(x, y).equals("w")) {
					g.drawImage(m.getWall(), x * 32, y * 32, null);
				}
			}
		}
		g.drawImage(p.getPlayer(), p.getTileX() * 32, p.getTileY() * 32, null);
	}

	
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_RIGHT) {
			try {
				if (m.getMap(p.getTileX() + 1, p.getTileY()).equals("g")) {
					p.setTileX(1);
				}
			} catch (StringIndexOutOfBoundsException ex) {
				JOptionPane.showMessageDialog(null,
						"Congratulations!!! "
						+ "You are a good maze runner!!!");
				System.exit(0);
			}

		} else if (key == KeyEvent.VK_LEFT) {
			if (m.getMap(p.getTileX() - 1, p.getTileY()).equals("g")) {
				p.setTileX(-1);
			}
		} else if (key == KeyEvent.VK_UP) {
			if (m.getMap(p.getTileX(), p.getTileY() - 1).equals("g")) {
				p.setTileY(-1);
			}
		} else if (key == KeyEvent.VK_DOWN) {
			if (m.getMap(p.getTileX(), p.getTileY() + 1).equals("g")) {
				p.setTileY(1);
			}
		}
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}