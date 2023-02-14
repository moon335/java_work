package ch04;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyImageFrame3 extends JFrame {

	private ImagePanel imagePanel;

	public MyImageFrame3() {
		initData();
		setInitLayout();
	}


	private void initData() {
		setTitle("이미지 연습");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		imagePanel = new ImagePanel();
	}

	private void setInitLayout() {
		add(imagePanel);
		setVisible(true);
	}
	// 내부 클래스
	static class ImagePanel extends JPanel {
		private Image image;
		private Image image2;
		private Image image3;
		private Image image4;
		private Image image5;
		private Image image6;

		public ImagePanel() {
			image6 = new ImageIcon("image6.jpg").getImage();
			image = new ImageIcon("image3.png").getImage();
			image2 = new ImageIcon("어몽어스_캐릭터.png").getImage();
			image3 = new ImageIcon("image3.png").getImage();
			image4 = new ImageIcon("image4.png").getImage();
			image5 = new ImageIcon("image5.png").getImage();
		}

		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawImage(image6, 0, 0, 600, 600, null);
			g.drawImage(image, 100, 100, 100, 100, null);
			g.drawImage(image2, 350, 350, 100, 100, null);
			g.drawImage(image3, 350, 200, 150, 130, null);
			g.drawImage(image4, 200, 150, 100, 100, null);
			g.drawImage(image5, 450, 100, 100, 100, null);
		}
	} // end of inner class

} // end of outer class
