package ch03;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame2 extends JFrame {

	// 내부 클래스를 활용해서
	// JPanel을 상속 받고 paint 메서드로
	// 집 그림을 그려 주세요.
	// cafe --> 결과 사진 올려주기

	MyDrawPanel drawPanel;

	class MyDrawPanel extends JPanel {

		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawString("☁☁", 100, 100);
			g.drawString("☁☁", 300, 50);
			g.drawString("☁☁", 150, 80);
			g.drawString("☁☁", 200, 40);
			g.drawString("☁☁", 250, 70);
			g.drawString("☁☁", 30, 30);
			g.drawString("☁☁", 30, 30);
			g.drawString("☁☁", 45, 80);
			g.drawString("☁☁", 400, 50);
			g.drawString("☁☁", 450, 30);
			g.drawString("☁☁", 500, 100);
			g.drawRect(300, 200, 150, 150);
			g.drawLine(375, 150, 300, 200);
			g.drawLine(375, 150, 450, 200);
			g.drawRect(386, 230, 50, 50);
			g.drawLine(386, 255, 436, 255);
			g.drawLine(411, 230, 411, 280);
			g.drawRect(320, 275, 50, 75);
			g.drawOval(325, 318, 5, 5);
			g.drawOval(510, -30, 100, 100);
			g.drawLine(490, 30, 440, 56);
			g.drawLine(490, 10, 440, 16);
			g.drawLine(500, 43, 450, 83);
			g.drawLine(510, 65, 460, 113);
			g.drawLine(536, 89, 495, 159);
			g.drawLine(570, 90, 560, 170);
			g.drawLine(0, 400, 600, 400);
			g.drawLine(0, 500, 100, 500);
			g.drawLine(130, 500, 190, 500);
			g.drawLine(220, 500, 280, 500);
			g.drawLine(310, 500, 370, 500);
			g.drawLine(400, 500, 460, 500);
			g.drawLine(490, 500, 550, 500);
			g.drawLine(580, 500, 600, 500);
		}
	}

	public MyFrame2() {
		initDate();
		setInitLayout();
	}

	private void initDate() {
		setTitle("집 그리기");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		drawPanel = new MyDrawPanel();
	}

	private void setInitLayout() {
		add(drawPanel);
		setVisible(true);
	}

}
