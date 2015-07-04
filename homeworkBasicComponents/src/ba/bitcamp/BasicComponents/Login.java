package ba.bitcamp.BasicComponents;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JPanel implements ActionListener {

	private static final long serialVersionUID = 2275163469453761234L;

	private JLabel label1 = new JLabel("Username: ");
	private JLabel label2 = new JLabel("Password: ");
	private JTextField field = new JTextField();
	private JPasswordField password = new JPasswordField();
	
	/**
	 * Constructor
	 */
	public Login() {

		JFrame frame = new JFrame("Login");
		frame.setLayout(new GridLayout(2, 0));

		field.addActionListener(this);
		password.addActionListener(this);

		frame.add(label1);
		frame.add(field);
		frame.add(label2);
		frame.add(password);
		frame.setSize(400, 100);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		new Login();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String user = field.getText();
		char[] pass = password.getPassword();
		if (user.equals("Mujo") && String.valueOf(pass).equals("1234")) {
			JFrame frame = new JFrame();
			frame.setVisible(true);
			System.exit(0);
		} else {
			JOptionPane.showMessageDialog(null, "Wrong username or password");
			field.setText("");
			password.setText("");
		}
	}
}
