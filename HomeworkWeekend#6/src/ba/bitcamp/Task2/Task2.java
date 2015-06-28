package ba.bitcamp.Task2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Task2 extends JFrame {

	private static final long serialVersionUID = -4916724240135944149L;

	public static class FirstName {
		public static String name = "Name";
		public static String character = "ABCDEFGHIJKLMNOPRSTUVZ";

		public static String generateName() {
			String newName = name
					+ character.charAt((int) (Math.random() * character
							.length()));
			return newName;
		}
	}

	public static class LastName {
		public static String surname = "Surname";

		public static String generateSurname() {
			String newSurname = surname
					+ FirstName.character
							.charAt((int) (Math.random() * FirstName.character
									.length()));
			return newSurname;
		}
	}

	private JButton button1 = new JButton("Name");
	private JButton button2 = new JButton("Surname");
	private JLabel text = new JLabel("Name  Surname");

	public Task2() {
		super("Task2");

		setLayout(new BorderLayout());

		add(button1, BorderLayout.WEST);
		button1.addActionListener(new Action());

		add(button2, BorderLayout.EAST);
		button2.addActionListener(new Action());

		text.setHorizontalAlignment(NORMAL);
		add(text, BorderLayout.CENTER);

	}

	private class Action implements ActionListener {

		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == button1) {
				String s = FirstName.generateName()
						+ text.getText().substring(5);
				text.setText(s);
			} else if (event.getSource() == button2) {
				String s = text.getText().substring(0, 6)
						+ LastName.generateSurname();
				text.setText(s);
			}

		}

	}
}
