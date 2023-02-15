package ch06;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorChange2 extends JFrame implements ActionListener{
	
	private JPanel panel1;
	private JPanel panel2;
	private JButton[] buttons = new JButton[7];
	private Color color1 = new Color(255, 0, 0);
	private Color color2 = new Color(255, 165, 0);
	private Color color3 = new Color(255, 255, 0);
	private Color color4 = new Color(124, 252, 0);
	private Color color5 = new Color(0, 0, 255);
	private Color color6 = new Color(0, 0, 128);
	private Color color7 = new Color(128, 0, 128);
	
	public ColorChange2() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel1 = new JPanel();
		panel2 = new JPanel();
		for(int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("button" + (i + 1));
		}
	}

	private void setInitLayout() {
		// Frame의 레이아웃은 borderLayout
		add(panel1, BorderLayout.CENTER);
		add(panel2, BorderLayout.SOUTH);
		panel1.setBackground(Color.yellow);
		panel2.setBackground(Color.yellow);
		panel2.setLayout(new FlowLayout(FlowLayout.RIGHT, 0, 0));
		for(int i = 0; i < buttons.length; i++) {
			panel2.add(buttons[i]);
		}
		setVisible(true);
	}

	private void addEventListener() {
		// this -> ColorChange -> ActionListener 타입으로 바라볼 수 있다.
		buttons[0].addActionListener(this);
		buttons[1].addActionListener(this);
		buttons[2].addActionListener(this);
		buttons[3].addActionListener(this);
		buttons[4].addActionListener(this);
		buttons[5].addActionListener(this);
		buttons[6].addActionListener(this);
	}

	// 테스트 코드
	public static void main(String[] args) {
		new ColorChange2();
		
		
	} // end of main

	// 약속 되어진 메서드
	// 이벤트가 일어나면 운영체제가 actionPerformed 메서드를 호출 시켜 준다.
	@Override
	public void actionPerformed(ActionEvent e) {
		// e.getSource() --> Object
		// 다운 캐스팅 버틍느로 코드 작성
		JButton targetButton = (JButton)e.getSource();
//		targetButton.setText("눌러진 버튼 입니다.");
		
//		System.out.println(e.getSource());
//		if(e.getSource() == this.button1) {
//			panel.setBackground(Color.gray);
//		} else {
//			panel.setBackground(Color.yellow);
//		}
		
		// 문자열을 비교해서 색상을 변경 시키는 코드를 작성해 주세요.
		if(targetButton.getText().equals("button1")) {
			panel1.setBackground(color1);
			panel2.setBackground(color1);
		} else if(targetButton.getText().equals("button2")){
			panel1.setBackground(color2);
			panel2.setBackground(color2);
		} else if(targetButton.getText().equals("button3")){
			panel1.setBackground(color3);
			panel2.setBackground(color3);
		} else if(targetButton.getText().equals("button4")){
			panel1.setBackground(color4);
			panel2.setBackground(color4);
		} else if(targetButton.getText().equals("button5")){
			panel1.setBackground(color5);
			panel2.setBackground(color5);
		} else if(targetButton.getText().equals("button6")){
			panel1.setBackground(color6);
			panel2.setBackground(color6);
		} else if(targetButton.getText().equals("button7")){
			panel1.setBackground(color7);
			panel2.setBackground(color7);
		}
		
	}

} // end of class
