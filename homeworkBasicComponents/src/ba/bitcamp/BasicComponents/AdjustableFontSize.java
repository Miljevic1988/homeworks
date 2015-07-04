package ba.bitcamp.BasicComponents;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class AdjustableFontSize extends JPanel {

	private static final long serialVersionUID = -6569237221729994201L;

	private JSlider slider = new JSlider(0, 100, 0);
	private JLabel label = new JLabel("Example");
	
	/**
	 * Constructor
	 */
	public AdjustableFontSize() {

		setLayout(new BorderLayout(0, 0));
		add(label, BorderLayout.CENTER);
		label.setHorizontalAlignment(0);
		label.setFont(new Font("Serif", Font.BOLD, 30));

		JFrame frame = new JFrame("AdjustableFontSize");
		frame.add(label);
		frame.add(slider, BorderLayout.SOUTH);

		slider.addChangeListener(new Change());
		slider.setMinorTickSpacing(10);
		slider.setMajorTickSpacing(100);
		slider.setPaintLabels(true);

		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

	private class Change implements ChangeListener {
		@Override
		public void stateChanged(ChangeEvent e) {

			label.setFont(new Font("Serif", Font.BOLD, slider.getValue()));

		}

	}

	public static void main(String[] args) {

		new AdjustableFontSize();

	}

}
