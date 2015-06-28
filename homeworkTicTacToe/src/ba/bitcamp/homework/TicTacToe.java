package ba.bitcamp.homework;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TicTacToe extends JFrame {

	private static final long serialVersionUID = 7215029516111190651L;
	public static final int NUM_ROWS_COLUMNS = 3;
	private JButton[][] fields;
	private String s;

	/**
	 * Constructor
	 */
	public TicTacToe() {
		super("TIC TAC TOE");
		setLayout(new GridLayout(TicTacToe.NUM_ROWS_COLUMNS,
				TicTacToe.NUM_ROWS_COLUMNS));

		s = ""; // this is X or O

		fields = new JButton[TicTacToe.NUM_ROWS_COLUMNS][TicTacToe.NUM_ROWS_COLUMNS];

		for (int i = 0; i < fields.length; i++) {
			for (int j = 0; j < fields.length; j++) {
				fields[i][j] = new JButton();
				fields[i][j].addActionListener(new HandlerClass(fields[i][j]));
				add(fields[i][j]);
			}
		}
	}

	private class HandlerClass implements ActionListener {

		private JButton button;

		public HandlerClass(JButton button) {
			this.button = button;
		}

		public void actionPerformed(ActionEvent e) {
			if (s.equals("X")) {
				s = "O";
			} else {
				s = "X";
			}
			button.setText(s);
		}
	}

}
