package ba.bitcamp.task4;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Task4 extends JFrame {
	
	private static final long serialVersionUID = 3301999040615650084L;
	private JButton button1 = new JButton("A");
	private JButton button2 = new JButton("Insert");
	private JButton button3 = new JButton(">");
	private JButton button4 = new JButton("<");

	public String[] s = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
			"K", "L", "M", "N", "O", "P", "R", "S", "T", "U", "V", "Z" };
	
	public String s1 = "";

	private JLabel text = new JLabel("_");

	public Task4() {
		super("Task4");
		setLayout(new BorderLayout());

		add(button1, BorderLayout.NORTH);
		add(button2, BorderLayout.SOUTH);
		add(button3, BorderLayout.EAST);
		add(button4, BorderLayout.WEST);
		add(text, BorderLayout.CENTER);
		
		button1.addActionListener(new Action());
		button2.addActionListener(new Action());
		button3.addActionListener(new Action());
		button4.addActionListener(new Action());
		
		text.setHorizontalAlignment(NORMAL);

	}

	private class Action implements ActionListener {

	
		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == button1) {
				button1.setText((s[(int) (Math.random() * s.length)]));
			} else if (event.getSource() == button2) {
				int temp = text.getText().indexOf("_");
				s1 = text.getText().substring(0, temp);
				s1 += button1.getText();
				s1 += "_";
				s1 += text.getText().substring(temp + 1,
						text.getText().length());
				text.setText(s1);
			} else if (event.getSource() == button3) {
				int temp = text.getText().indexOf("_");
				try {
					s1 = text.getText().substring(0, temp);
					s1 += text.getText().substring(temp + 1, temp + 2) + "_";
					s1 += text.getText().substring(temp + 2,
							text.getText().length());
					text.setText(s1);
				} catch (StringIndexOutOfBoundsException ex) {
				}
			} else if (event.getSource() == button4) {
				int temp = text.getText().indexOf("_");
				try {
					s1 = text.getText().substring(0, temp - 1);
					s1 += "_";
					s1 += text.getText().substring(temp - 1, temp);
					s1 += text.getText().substring(temp + 1,
							text.getText().length());
					text.setText(s1);
				} catch (StringIndexOutOfBoundsException ex) {
				}
			}
		}

	}
}
