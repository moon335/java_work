package ex01;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LottoFrame extends JFrame {
	// 화면을 담당 !!
	// LottoRandomNumber 클래스에서 받아와서 처리
	JButton button;
	LottoRandomNumber lottoRandomNumber;
	boolean isStart = false;
	
	public LottoFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("game start");
		lottoRandomNumber = new LottoRandomNumber();
	}
	private void setInitLayout() {
		add(button, BorderLayout.SOUTH);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		// 그림을 그릴 때 두 가지 구분, 처음, 버튼
		if(isStart == false) {
			g.drawString("게임을 실행해주세요.", 150, 150);
			return;
		}
		// 6개 정렬된 값을 받음 !
		// 실행의 흐름을 사용하는 변수를 쓰면 값 초기화를 잘 확인하자.
		int[] getNumbers = lottoRandomNumber.createNumber();
		
		g.drawString(getNumbers[0] + "" , 50, 150);
		g.drawString(getNumbers[1] + "" , 150, 150);
		g.drawString(getNumbers[2] + "" , 250, 150);
		g.drawString(getNumbers[3] + "" , 350, 150);
		g.drawString(getNumbers[4] + "" , 450, 150);
		g.drawString(getNumbers[5] + "" , 550, 150);
		
	}
	
	private void addEventListener() {
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				isStart = true;
				// 그림을 다시 그려라
				repaint();
			}
		});
	}

} // end of class
