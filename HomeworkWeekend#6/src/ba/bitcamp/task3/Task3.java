package ba.bitcamp.task3;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Task3 extends JFrame {

	private static final long serialVersionUID = -1146520898432181160L;
	private JButton[] buttons = new JButton[5];
	private JButton[] buttons1 = new JButton[5];

	public String[] arr = new String[5];

	public Task3() {
		super("Task3");
		
		setLayout(new GridLayout(2, 5));
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(Integer.toString(i));
			add(buttons[i], GridLayout.class);
			buttons[i].addActionListener(new Action());
		}
		
		for (int i = 0; i < buttons.length; i++) {
			buttons1[i] = new JButton(Integer.toString(i + 5));
			add(buttons1[i], GridLayout.class);
			buttons1[i].addActionListener(new Action());
		}

		 
	}

	private class Action implements ActionListener {

		public void actionPerformed(ActionEvent event) {
			for (int i = 0; i < buttons.length; i++) {
				if (event.getSource() == buttons[i]) {
					buttons1[i].setEnabled(false);
					arr[i] = buttons[i].getText();
				} else if (event.getSource() == buttons1[i]) {
					buttons[i].setEnabled(false);
					arr[i] = buttons1[i].getText();
				}
			}
			if (arr[4] != null) {
				JOptionPane.showMessageDialog(null, Arrays.toString(arr));
				System.exit(0);
			}
		}

	}
}
