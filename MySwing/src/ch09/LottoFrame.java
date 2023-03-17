package ch09;

import java.awt.BorderLayout;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LottoFrame extends JFrame {
	// 화면을 담당 !!
	// LottoRandomNumber 클래스에서 받아와서 처리
	JButton button;
	LottoRandomNumber number;

	public LottoFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("로또 번호 추첨");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("번호 추첨");
		number = new LottoRandomNumber();
	}

	private void setInitLayout() {
		add(button, BorderLayout.NORTH);
		setVisible(true);
	}

	private void addEventListener() {
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("게임 시작");
				number.randomNumber();
				repaint();
			}
		});
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Font font = new Font("궁서체", Font.BOLD, 25);
		g.setFont(font);
		if(number.getLottoNumber()[0] == 0) {
			g.drawString("버튼을 눌러 주세요", 180, 200);
			return;
		}
		int x = 50;
		for(int i = 0; i < number.getLottoNumber().length; i++) {
			g.drawString(number.getLottoNumber()[i] + "", x, 200);
			g.drawOval((x - 25), 155, 70, 70);
			x += 80;
		}
	}

} // end of class
