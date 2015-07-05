import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.ImageIcon;

public class Map {

	private Scanner map;
	private String Map[] = new String[21];
	private Image grass;
	private Image wall;

	/**
	 * Constructor
	 */
	public Map() {

		ImageIcon img = new ImageIcon("img\\grass.png");
		grass = img.getImage();
		img = new ImageIcon("img\\wall.png");
		wall = img.getImage();

		openFile();
		readFile();
		closeFile();

	}

	/**
	 * This method gets grass.
	 */
	public Image getGrass() {
		return grass;
	}

	/**
	 * This method gets wall.
	 */
	public Image getWall() {
		return wall;
	}

	/**
	 * This method gets map.
	 */
	public String getMap(int x, int y) {

		String index = Map[y].substring(x, x + 1);
		return index;

	}

	/**
	 * This method opens file.
	 */
	private void openFile() {

		try {
			map = new Scanner(new File("Map.txt"));
		} catch (Exception e) {
			System.out.println("error loading map");
		}
	}

	/**
	 * This method reads file.
	 */
	private void readFile() {
		while (map.hasNext()) {
			for (int i = 0; i < 21; i++) {
				Map[i] = map.next();
			}
		}
	}

	/**
	 * This method closes file.
	 */
	private void closeFile() {
		map.close();

	}

}
