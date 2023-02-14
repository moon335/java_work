package ch04;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

// Swing 이미지를 다루는 방법은 3가지 정도
// JLable <-- String, image()
public class MyImageFrame extends JFrame {
	
	ImagePanel imagePanel; // 내부 클래스를 멤버 변수로 선언
	
	// JPanel 안에 이미지 넣는 방법 !!
	// 내부 클래스 이용해 보기
	class ImagePanel extends JPanel {
		
		private Image image;
		
		public ImagePanel() {
			// 외부에 있는 이미지를 메모리로 가져오는 동작이다.
			// 메모리를 가져와서 주소를 변수 안에 담는다.
			image = new ImageIcon("어몽어스_캐릭터.png").getImage();
		}
		
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			// 대상 지정 
			// x좌표 y좌표
			// 가로길이 세로길이
			// 옵저버 <-- 추후 설명
			g.drawImage(image, 0, 0, 400, 400, null);
		}
	} // end of class
	
	public MyImageFrame() {
		initDate();
		setInitLayout();
	}

	private void initDate() {
		setTitle("이미지 연습");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		imagePanel = new ImagePanel();
	}

	private void setInitLayout() {
		add(imagePanel);
		setVisible(true);
	}

}
