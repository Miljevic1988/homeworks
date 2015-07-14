import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;

public class Maze {

	private JFrame frame = new JFrame("Maze Runner");

	/**
	 * Constructor
	 */
	public Maze() {

		frame.add(new Board());
		frame.setSize(1020, 720);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		File sound = new File("sound//Game.WAV");
		PlaySound(sound);
		PlaySound(sound);

	}

	/**
	 * This method plays sound.
	 */
	private static void PlaySound(File sound) {
		try {
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(sound));
			clip.start();

			Thread.sleep(clip.getMicrosecondLength() / 1000);

		} catch (Exception e) {

		}
	}

	public static void main(String[] args) {
		new Maze();
	}
}