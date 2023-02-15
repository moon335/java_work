package ch07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyKeyFrame extends JFrame {
	// 1. 구현처리
	// 2. 익명 클래스
	private JTextArea area;

	public MyKeyFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		area = new JTextArea();
	}

	private void setInitLayout() {
		add(area);
		setVisible(true);
	}

	private void addEventListener() {
		area.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_UP) {
					area.append("앞으로 이동\n");
				}
				if(e.getKeyCode() == KeyEvent.VK_DOWN) {
					area.append("뒤로 이동\n");
				}
				if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					area.append("왼쪽으로 이동\n");
				}
				if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
					area.append("오른쪽으로 이동\n");
				}
			}
		});
	}

} // end of class
