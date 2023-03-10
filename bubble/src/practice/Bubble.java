package practice;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Bubble extends JLabel implements Moveable{
	
	// 버블 좌표
	private int x;
	private int y;
	
	// 버블 이미지
	private ImageIcon bubble;
	private ImageIcon bubbled;
	private ImageIcon bomb;
	
	// 버블의 방향 상태
	private boolean left;
	private boolean right;
	private boolean up;
	
	// 버블은 플레이어에 의존하는 형태임
	private Player player;
	private BackgroundBubbleService backgroundBubbleService;
	
	public Bubble(Player player) {
		this.player = player;
		initData();
		setInitLayout();
		backgroundBubbleService = new BackgroundBubbleService(this);
		initThread();
	}
	
	private void initData() {
		bubble = new ImageIcon("images/bubble.png");
		bubbled = new ImageIcon("images/bubbled.png");
		bomb = new ImageIcon("images/bomb.png");
		left = false;
		right = false;
		up = false;
		
	}
	
	private void setInitLayout() {
		x = player.getX();
		y = player.getY();
		setIcon(bubble);
		setSize(50, 50);
		setLocation(x, y);
	}
	
	private void initThread() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				if(player.getpWay() == PlayerWay.LEFT) {
					left();
				} else {
					right();
				}
			}
		}).start();
	}
	
	
	@Override
	public void left() {
		left = true;
		for(int i = 0; i < 400; i++) {
			x--;
			setLocation(x, y);
			if(backgroundBubbleService.leftWall()) {
				break;
			}
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		up();
	}

	@Override
	public void right() {
		right = true;
		for(int i = 0; i < 400; i++) {
			x++;
			setLocation(x, y);
			if(backgroundBubbleService.rightWall()) {
				break;
			}
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		up();
	}

	@Override
	public void up() {
		up = true;
		while(up) {
			y--;
			setLocation(x, y);
			if(backgroundBubbleService.topWall()) {
				break;
			}
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
} // end of class
