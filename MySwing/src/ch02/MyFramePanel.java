package ch02;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFramePanel extends JFrame{
	
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	
	// 패널: 컴포넌트들을 그룹화 시킬 수 있다. 즉 각각의 배치관리자를 지정할 수 있다.
	private JPanel panel1;
	private JPanel panel2;
	
	public MyFramePanel() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("패널 추가 연습");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel1 = new JPanel();
		panel1.setBackground(Color.red);
		panel2 = new JPanel();
		panel2.setBackground(Color.yellow);
		
		// 버튼 초기화
		button1 = new JButton("button1");
		button1.setSize(100, 100);
		button2 = new JButton("button2");
		button2.setSize(100, 100);
		button3 = new JButton("button3");
		button3.setSize(100, 100);
		button4 = new JButton("button4");
		button5 = new JButton("button5");
		button6 = new JButton("button6");
		
	}
	
	private void setInitLayout() {
		add(panel1, BorderLayout.CENTER);
		add(panel2, BorderLayout.SOUTH);
		// 루트 패널 기본 레이아웃은 BorderLayout 이다.
		// 하지만 추가적으로 만들어 사용하는 Panel은 기본 레이아웃이 FlowLayout이다.
		panel1.setLayout(null);
		panel1.add(button1);
		panel1.add(button2);
		panel1.add(button3);
		button1.setLocation(0, 0);
		button2.setLocation(100, 0);
		button3.setLocation(200, 0);
//		panel1.setLayout(null);
		panel2.setLayout(new FlowLayout(FlowLayout.RIGHT, 0, 0));
		panel2.add(button4);
		panel2.add(button5);
		panel2.add(button6);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFramePanel();
	}
	
} // end of class
