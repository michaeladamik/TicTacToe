import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TicTacToeGUI implements ActionListener {
	
	JFrame frame;
	
	JPanel panel;
	
	JLabel text; 
	
	JButton button1 = new JButton("1");
	JButton button2 = new JButton("2");
	JButton button3 = new JButton("3");
	JButton button4 = new JButton("4");
	JButton button5 = new JButton("5");
	JButton button6 = new JButton("6");
	JButton button7 = new JButton("7");
	JButton button8 = new JButton("8");
	JButton button9 = new JButton("9");
	
	
	TicTacToe game;
	
	public TicTacToeGUI() {
		game = new TicTacToe();
		
		frame = new JFrame();
		
		text = new JLabel("It is player " + game.getcurrplayer() + "'s turn. Please select a button to place a move:");
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout(3, 3));
		
		
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Tic Tac Toe");
		frame.pack();
		frame.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new TicTacToeGUI();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(button1)) {
			button1.setEnabled(false);
			button1.setText(game.getcurrplayer());
			game.nextplayer();
		} else if(e.getSource().equals(button2)) {
			button2.setEnabled(false);
			button2.setText(game.getcurrplayer());
			game.nextplayer();
		} else if(e.getSource().equals(button3)) {
			button3.setEnabled(false);
			button3.setText(game.getcurrplayer());
			game.nextplayer();
		} else if(e.getSource().equals(button4)) {
			button4.setEnabled(false);
			button4.setText(game.getcurrplayer());
			game.nextplayer();
		} else if(e.getSource().equals(button5)) {
			button5.setEnabled(false);
			button5.setText(game.getcurrplayer());
			game.nextplayer();
		} else if(e.getSource().equals(button6)) {
			button6.setEnabled(false);
			button6.setText(game.getcurrplayer());
			game.nextplayer();
		} else if(e.getSource().equals(button7)) {
			button7.setEnabled(false);
			button7.setText(game.getcurrplayer());
			game.nextplayer();
		} else if(e.getSource().equals(button8)) {
			button8.setEnabled(false);
			button8.setText(game.getcurrplayer());
			game.nextplayer();
		} else if(e.getSource().equals(button9)) {
			button9.setEnabled(false);
			button9.setText(game.getcurrplayer());
			game.nextplayer();
		}
		
	}
}
