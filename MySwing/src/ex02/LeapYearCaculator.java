package ex02;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LeapYearCaculator extends JFrame{
	
	private JButton button;
	private JTextField field;
	private JLabel label;
	
	public LeapYearCaculator() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("윤년 계산기");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		button = new JButton("확인");
		button.setSize(80, 20);
		field = new JTextField(4);
		field.setSize(150, 20);
		label = new JLabel("윤년인지 아닌지 확인합니다.");
		label.setSize(200, 30);
	}
	
	private void setInitLayout() {
		setLayout(null);
		add(field);
		field.setLocation(120, 0);
		add(button);
		button.setLocation(270, 0);
		add(label);
		label.setLocation(130, 20);
		setVisible(true);
	}
	
	private void addEventListener() {
		field.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == 10) {
					LeapYear();
				}
			}
		});
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				LeapYear();
			}
		});
	}
	
	public void LeapYear() {
		int year = Integer.parseInt(field.getText());
		if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
			label.setText("윤년입니다.");
		} else if(year % 4 == 0 && year % 100 == 0) {
			label.setText("윤년이 아닙니다.");
		} else if(year % 4 == 0) {
			label.setText("윤년입니다.");					
		} else {
			label.setText("윤년이 아닙니다.");
		}
	}
	
}
