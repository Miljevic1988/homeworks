package ba.bitcamp.homework;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		//creating object
		TicTacToe t = new TicTacToe();
		
		//settings
		t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		t.setBounds(300, 300, 300, 300);
		t.setVisible(true);
		t.setResizable(false);
	

	}

}
