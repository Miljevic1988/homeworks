package ba.bitcamp.BasicComponents;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

public class Countdown extends JPanel {

	private static final long serialVersionUID = -696905511236564688L;

	private JFrame frame = new JFrame("Countdown");
	private JLabel label = new JLabel("Countdown", JLabel.CENTER);
	private JTextField text = new JTextField();
	private JButton button = new JButton("Start");
	private int time = -1;

	/**
	 * Constructor.
	 */
	public Countdown() {

		frame.setLayout(new GridLayout(3, 0));

		text.setHorizontalAlignment(JTextField.CENTER);

		Timer timer = new Timer(1000, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (time >= 0) {
					label.setText((time--) + "");
				}
			}
		});

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (time == -1) {
					try {
						time = Integer.parseInt(text.getText());
						timer.start();
					} catch (NumberFormatException e1) {
						JOptionPane.showMessageDialog(null, "Wrong input");
					}
				}
			}
		});

		frame.add(label);
		frame.add(text);
		frame.add(button);

		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		new Countdown();
	}
}