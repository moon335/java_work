package ch07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MoveLabelFrame2 extends JFrame implements Moveable{
	
	private JLabel labelText;
	private int labelTextX;
	private int labelTextY;
	
	public MoveLabelFrame2() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		// 초기값 세팅
		labelTextX = 300;
		labelTextY = 350;
		labelText = new JLabel("Hello World~");
		labelText.setSize(100, 100);
	}
	private void setInitLayout() {
		setLayout(null);
		labelText.setLocation(300, 350);
		add(labelText);
		setVisible(true);
	}
	private void addEventListener() {
		this.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// 현재 이벤트가 일어난 시점의 x,y 좌표값 확인
//				int currentX = labelText.getX();
//				int currentY = labelText.getY();
//				labelText.move(320, 350);
				if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
					right();
				}
				if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					left();
				}
				if(e.getKeyCode() == KeyEvent.VK_UP) {
					up();
				}
				if(e.getKeyCode() == KeyEvent.VK_DOWN) {
					down();
				}
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				
			}
		});
	}

	@Override
	public void left() {
		int x = labelTextX -= 50;
		if(x < 0) {
			x = labelTextX = 0;
		}
		int y = labelTextY;
		labelText.setLocation(x, y);
	}

	@Override
	public void right() {
		int x = labelTextX += 50;
		if(x > 700) {
			x = labelTextX = 700;
		}
		int y = labelTextY;
		labelText.setLocation(x, y);
	}

	@Override
	public void up() {
		int x = labelTextX;
		int y = labelTextY -= 50;
		if(y < 0) {
			y = labelTextY = -40;
		}
		labelText.setLocation(x, y);
	}

	@Override
	public void down() {
		int x = labelTextX;
		int y = labelTextY += 50;
		if(y > 700) {
			y = labelTextY = 700;
		}
		labelText.setLocation(x, y);
	}
	
	
} // end of class
