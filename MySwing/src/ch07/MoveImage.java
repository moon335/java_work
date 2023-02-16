package ch07;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MoveImage extends JFrame implements Moveable{
	
	private JLabel labelImage;
	private JLabel labelImage2;
	private int labelImageX;
	private int labelImageY;
	
	public MoveImage() {
		initData();
		setInitLayout();
		addEventListener();
	}

	
	public void initData() {
		setSize(1000, 1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		labelImageX = 300;
		labelImageY = 300;
		labelImage = new JLabel(new ImageIcon("images/image4.png"));
		labelImage2 = new JLabel(new ImageIcon("images/image9.png"));
		labelImage.setSize(200, 200);
		labelImage2.setSize(1000, 1000);
	}
	public void setInitLayout() {
		setLayout(null);
		add(labelImage);
		add(labelImage2);
		labelImage.setLocation(300, 300);
		labelImage2.setLocation(0, 0);
		setVisible(true);
	}
	public void addEventListener() {
		this.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				
	
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
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
		});
	}


	@Override
	public void left() {
		int x = labelImageX -= 50;
		if(x < 0) {
			x = labelImageX = 0;
		}
		int y = labelImageY;
		labelImage.setLocation(x, y);
	}


	@Override
	public void right() {
		int x = labelImageX += 50;
		if(x > 800) {
			x = labelImageX -= 50;
		}
		int y = labelImageY;
		labelImage.setLocation(x, y);
	}


	@Override
	public void up() {
		int x = labelImageX;
		int y = labelImageY -= 50;
		if(y < 0) {
			y = labelImageY += 50;
		}
		labelImage.setLocation(x, y);
	}


	@Override
	public void down() {
		int x = labelImageX;
		int y = labelImageY += 50;
		if(y > 790) {
			y = labelImageY -= 50;
		}
		labelImage.setLocation(x, y);
	}
	
	
	
} // end of class
