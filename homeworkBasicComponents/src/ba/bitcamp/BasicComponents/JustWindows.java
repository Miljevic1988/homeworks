package ba.bitcamp.BasicComponents;

import javax.swing.JOptionPane;

public class JustWindows {

	public JustWindows() {

		
			int sum = Integer.parseInt(JOptionPane
					.showInputDialog("Please enter number: "));
			while (JOptionPane.showConfirmDialog(null,
					"Do you want to add another number?", "Message",
					JOptionPane.YES_NO_CANCEL_OPTION) == JOptionPane.YES_OPTION) {
				String s = JOptionPane.showInputDialog("Please enter one more number");
				if (s != null) {
					sum += Integer.parseInt(s);
				} else {
					JOptionPane.showMessageDialog(null, "Sum is " + sum);
					System.exit(0);
				}
			}
		 

	}

	public static void main(String[] args) {

		new JustWindows();

	}

}
