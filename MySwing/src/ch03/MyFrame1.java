package ch03;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 
 * 학습 목표 내부 클래스, 외부 클래스
 */
// 외부 클래스 outer class
public class MyFrame1 extends JFrame{
	
	MyDrawPanel drawPanel; // 멤버 변수 선언
	
	// 내부 클래스 선언 - inner class
	// 내부 클래스에는 - 정적 클래스 인스턴스 클래스로 나눌 수 있음
	// 정적 클래스 - static이 붙음.  <-- new하지 않더라도 접근 가능. 클래스 이름으로 접근 가능
	// 인스턴스 클래스 - new 해야 접근 가능 <-- 외부 클래스가 먼저 생성된 후 내부 클래스가 생성되어야 한다.
	class MyDrawPanel extends JPanel{
		// paints --> x
		// print --> x
		@Override // 주석 + 힌트
		public void paint(Graphics g) {
			super.paint(g);
			g.drawRect(100, 100, 100, 200);
			g.drawRect(100, 50, 50, 50);
			g.drawString("반가워", 300, 300);
			g.drawLine(250, 300, 500, 550);
			g.drawOval(300, 300, 50, 50);
		}
		
	} // end of class
	
	
	public MyFrame1() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("내부 클래스란");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		drawPanel = new MyDrawPanel();
	}

	private void setInitLayout() {
		add(drawPanel);
		setVisible(true);
	}

} // end of class
