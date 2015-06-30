package ba.bitcamp.task1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Task1 extends JFrame {

	private static final long serialVersionUID = -369076780720963741L;

	private JButton[] buttons = new JButton[10];

	public String s = "";

	public Task1() {
		super("Task1");
		setLayout(new GridLayout(10, 1));
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(Integer.toString(i));
			add(buttons[i], GridLayout.class);
			buttons[i].addActionListener(new Action());
		}

	}

	private class Action implements ActionListener {

		public void actionPerformed(ActionEvent event) {
			for (int i = 0; i < buttons.length; i++) {
				if (event.getSource() == buttons[i]) {
					s += buttons[i].getText();
				}
				if (s.length() == 3) {
					JOptionPane.showMessageDialog(null, "Number: " + s);
					System.exit(0);
				}
			}
		}

	}

}