package practice;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel implements Moveable {

	private int x;
	private int y;
	private ImageIcon playerR, playerL;
	ImageIcon bubble;
	private boolean left;
	private boolean right;
	private boolean up;
	private boolean down;
	private final int SPEED = 4;
	private final int JUMPSPEED = 2;
	private boolean leftWallCrash;
	private boolean rightWallCrash;
	private boolean topWallCrash;
	private boolean bottomWallCrash;
	private boolean jumped;

	public Player() {
		initData();
		setInitLayout();
	}

	// getter 메서드 추가 left, right, leftWallCrash 추가 rightWallCrash

	public boolean isLeftWallCrash() {
		return leftWallCrash;
	}

	public boolean isRightWallCrash() {
		return rightWallCrash;
	}

	public boolean isLeft() {
		return left;
	}

	public boolean isRight() {
		return right;
	}

	public boolean isUp() {
		return up;
	}

	public boolean isDown() {
		return down;
	}

	public boolean isTopWallCrash() {
		return topWallCrash;
	}

	public boolean isBottomWallCrash() {
		return bottomWallCrash;
	}
	
	public boolean isJumped() {
		return jumped;
	}
	
	// setter 메서드

	public void setLeft(boolean left) {
		this.left = left;
	}

	public void setLeftWallCrash(boolean leftWallCrash) {
		this.leftWallCrash = leftWallCrash;
	}

	public void setRightWallCrash(boolean rightWallCrash) {
		this.rightWallCrash = rightWallCrash;
	}

	public void setRight(boolean right) {
		this.right = right;
	}

	public void setUp(boolean up) {
		this.up = up;
	}

	public void setDown(boolean down) {
		this.down = down;
	}

	public void setTopWallCrash(boolean topWallCrash) {
		this.topWallCrash = topWallCrash;
	}

	public void setBottomWallCrash(boolean bottomWallCrash) {
		this.bottomWallCrash = bottomWallCrash;
	}
	
	public void setJumped(boolean jumped) {
		this.jumped = jumped;
	}
	
	private void initData() {
		playerR = new ImageIcon("images/playerR.png");
		playerL = new ImageIcon("images/playerL.png");
		bubble = new ImageIcon("images/bubble.png");
		left = false;
		right = false;
		up = false;
		down = false;
		leftWallCrash = false;
		rightWallCrash = false;
		topWallCrash = false;
		bottomWallCrash = false;
		jumped = false;
	}

	private void setInitLayout() {
		x = 55;
		y = 535;
		setSize(50, 50);
		setLocation(x, y);
		setIcon(playerR);
	}

	@Override
	public void left() {

		left = true;
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (left) {
					setIcon(playerL);
					x = x - SPEED;
					setLocation(x, y);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} // end of while
			}
		}).start();
	}

	@Override
	public void right() {

		right = true;
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (right) {
					setIcon(playerR);
					x = x + SPEED;
					setLocation(x, y);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} // end of while
			}
		}).start();
	}

	@Override
	public void up() {
		up = true;
		jumped = true;
		new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i < 130 / JUMPSPEED; i++) {
					y = y - JUMPSPEED;
					setLocation(x, y);
					try {
						Thread.sleep(5);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} // end of for
				up = false;
				down();
			}
		}).start();
	}

	@Override
	public void down() {
		down = true;
		new Thread(new Runnable() {
			@Override
			public void run() {
				while(down) {
					y = y + JUMPSPEED;
					setLocation(x, y);
					try {
						Thread.sleep(3);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					down = false;
				}
				// 상태값을 다룰 때는 상황이 변화면 초기화 처리를 잘 해줘야한다.
			}
		}).start();
	}
} // end of class
