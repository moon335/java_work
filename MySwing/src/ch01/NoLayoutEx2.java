package ch01;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NoLayoutEx2 extends JFrame{
	
	JButton[] buttons = new JButton[4];
	String[] direction = {"동", "서", "남", "북"};
	
	public NoLayoutEx2() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("방향키 만들기");
		setSize(1_000, 1_000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for(int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(direction[i]);
		}
		for(int j = 0; j < buttons.length; j++) {
			buttons[j].setSize(100, 100);
		}
	}

	private void setInitLayout() {
		setLayout(null);
		buttons[1].setLocation(100, 200);
		add(buttons[0]);
		buttons[2].setLocation(200, 200);
		add(buttons[1]);
		buttons[0].setLocation(300, 200);
		add(buttons[2]);
		buttons[3].setLocation(200, 100);
		add(buttons[3]);
		setVisible(true);
	}

	public static void main(String[] args) {
		new NoLayoutEx2();
	} // end of main
	
} // end of class
