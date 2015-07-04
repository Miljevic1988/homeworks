package ba.bitcamp.BasicComponents;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AdjustableFontStyle extends JPanel implements ActionListener {

	private static final long serialVersionUID = -2684005296735094116L;

	private JFrame frame = new JFrame("AdjustableFontStyle");
	private JLabel label = new JLabel("Example");
	private JCheckBox box1 = new JCheckBox("Bold");
	private JCheckBox box2 = new JCheckBox("Italic");
	private JButton button = new JButton("Apply");
	
	/**
	 * Constructor
	 */
	public AdjustableFontStyle() {

		frame.setLayout(new GridLayout(4, 0));

		label.setFont(new Font(Font.SERIF, Font.PLAIN, 30));
		frame.add(label);
		frame.add(box1);
		frame.add(box2);
		frame.add(button);
		button.addActionListener(this);

		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (box1.isSelected()) {
			label.setFont(new Font(Font.SERIF, Font.BOLD, 30));
		} else if (box2.isSelected()) {
			label.setFont(new Font(Font.SERIF, Font.ITALIC, 30));
		} else if (box1.isSelected() && box2.isSelected()) {
			label.setFont(new Font(Font.SERIF, Font.BOLD + Font.ITALIC, 30));
		}

	}

	public static void main(String[] args) {

		new AdjustableFontStyle();

	}

}
