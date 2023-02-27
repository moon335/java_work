package projectFinish;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel {

	// player 좌표
	private int x;
	private int y;

	// player 이미지
	private ImageIcon playerR;
	private ImageIcon playerL;
	private ImageIcon playerU;
	private ImageIcon playerD;

	// player 방향 상태
	private boolean left;
	private boolean right;
	private boolean up;
	private boolean down;
	// 무적 상태
	private boolean ghost;

	// player 속도 상태
	private final int SPEED = 5;

	// 벽 충돌 상태
	private boolean leftWallCrash;
	private boolean rightWallCrash;
	private boolean topWallCrash;
	private boolean bottomWallCrash;

	PacManFrame mContext;
	private ImageIcon dieMotion;
	private boolean eatMarble;

	// player가 보는 방향
	PlayerWay pWay;

	// player 죽은 상태
	private boolean die;

	// player 라이프 상태
	private int lifeCount;

	public Player(PacManFrame mContext) {
		this.mContext = mContext;
		initData();
		setInitLayout();
	}

	public ImageIcon getDieMotion() {
		return dieMotion;
	}

	public void setDieMotion(ImageIcon dieMotion) {
		this.dieMotion = dieMotion;
	}

	public boolean isEatMarble() {
		return eatMarble;
	}

	public void setEatMarble(boolean eatMarble) {
		this.eatMarble = eatMarble;
	}

	public PacManFrame getmContext() {
		return mContext;
	}

	public void setmContext(PacManFrame mContext) {
		this.mContext = mContext;
	}

	public boolean isDie() {
		return die;
	}

	public void setDie(boolean die) {
		this.die = die;
	}

	public int getLifeCount() {
		return lifeCount;
	}

	public void setLifeCount(int lifeCount) {
		this.lifeCount = lifeCount;
	}

	public boolean isGhost() {
		return ghost;
	}

	public void setGhost(boolean ghost) {
		this.ghost = ghost;
	}

	public PlayerWay getpWay() {
		return pWay;
	}

	public boolean isLeftWallCrash() {
		return leftWallCrash;
	}

	public void setLeftWallCrash(boolean leftWallCrash) {
		this.leftWallCrash = leftWallCrash;
	}

	public boolean isRightWallCrash() {
		return rightWallCrash;
	}

	public void setRightWallCrash(boolean rightWallCrash) {
		this.rightWallCrash = rightWallCrash;
	}

	public boolean isTopWallCrash() {
		return topWallCrash;
	}

	public void setTopWallCrash(boolean topWallCrash) {
		this.topWallCrash = topWallCrash;
	}

	public boolean isBottomWallCrash() {
		return bottomWallCrash;
	}

	public void setBottomWallCrash(boolean bottomWallCrash) {
		this.bottomWallCrash = bottomWallCrash;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean isLeft() {
		return left;
	}

	public void setLeft(boolean left) {
		this.left = left;
	}

	public boolean isRight() {
		return right;
	}

	public void setRight(boolean right) {
		this.right = right;
	}

	public boolean isUp() {
		return up;
	}

	public void setUp(boolean up) {
		this.up = up;
	}

	public boolean isDown() {
		return down;
	}

	public void setDown(boolean down) {
		this.down = down;
	}

	private void initData() {
		playerR = new ImageIcon("images/PacmanR.png");
		playerL = new ImageIcon("images/PacmanL.png");
		playerU = new ImageIcon("images/PacmanU.png");
		playerD = new ImageIcon("images/PacmanD.png");
		dieMotion = new ImageIcon("images/die.gif");
		left = false;
		right = false;
		up = false;
		down = false;
		leftWallCrash = false;
		rightWallCrash = false;
		topWallCrash = false;
		bottomWallCrash = false;
		pWay = PlayerWay.RIGHT;
		die = false;
		lifeCount = 3;
		eatMarble = false;
	}

	private void setInitLayout() {
		x = 340;
		y = 350;
		setSize(40, 40);
		setLocation(x, y);
		setIcon(playerR);
	}

	public void initThread() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				if (left) {
					left();
				} else if (right) {
					right();
				} else if (up) {
					up();
				} else if (down) {
					down();
				}
			}
		}).start();
	}

	public void left() {
		pWay = PlayerWay.LEFT;
		setIcon(playerL);
		while (left) {
			x = x - SPEED;
			setLocation(x, y);
			eatSeed();
			eatMarble();
			try {
				Thread.sleep(15);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void right() {
		pWay = PlayerWay.RIGHT;
		setIcon(playerR);
		while (right) {
			x = x + SPEED;
			setLocation(x, y);
			eatSeed();
			eatMarble();
			try {
				Thread.sleep(15);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void up() {
		pWay = PlayerWay.UP;
		setIcon(playerU);
		while (up) {
			y = y - SPEED;
			setLocation(x, y);
			eatSeed();
			eatMarble();
			try {
				Thread.sleep(15);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void down() {
		pWay = PlayerWay.DOWN;
		setIcon(playerD);
		while (down) {
			y = y + SPEED;
			setLocation(x, y);
			eatSeed();
			eatMarble();
			try {
				Thread.sleep(15);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void resurrection() {
		this.x = 340;
		this.y = 340;
		setLocation(340, 340);
		setIcon(playerR);
		ghost = false;
		repaint();
	}

	public void eatSeed() {
		if (left) {
			for (int i = 0; i < mContext.getSeed().length; i++) {
				if (Math.abs(x - mContext.getSeed(i).getX()) < 15 && Math.abs(y - mContext.getSeed(i).getY()) < 15) {
					mContext.getSeed(i).setIcon(null);
					mContext.getScore().scoreUp();
					mContext.getSeed(i).setLocation(0, 0);
				}
			}
			mContext.repaint();
		} // end of isLeft

		if (right) {
			for (int i = 0; i < mContext.getSeed().length; i++) {
				if (Math.abs(x - mContext.getSeed(i).getX()) < 15 && Math.abs(y - mContext.getSeed(i).getY()) < 15) {
					mContext.getSeed(i).setIcon(null);
					mContext.getScore().scoreUp();
					mContext.getSeed(i).setLocation(0, 0);
				}
			}
			mContext.repaint();
		} // end of isRight

		if (up) {
			for (int i = 0; i < mContext.getSeed().length; i++) {
				if (Math.abs(x - mContext.getSeed(i).getX()) < 15 && Math.abs(y - mContext.getSeed(i).getY()) < 15) {
					mContext.getSeed(i).setIcon(null);
					mContext.getScore().scoreUp();
					mContext.getSeed(i).setLocation(0, 0);
				}
			}
			mContext.repaint();
		} // end of isUp

		if (down) {
			for (int i = 0; i < mContext.getSeed().length; i++) {
				if (Math.abs(x - mContext.getSeed(i).getX()) < 15 && Math.abs(y - mContext.getSeed(i).getY()) < 15) {
					mContext.getSeed(i).setIcon(null);
					mContext.getScore().scoreUp();
					mContext.getSeed(i).setLocation(0, 0);
				}
			}
			mContext.repaint();
		} // end of isDown
	}// end of eatSeed

	// 구슬 먹은 경우
	public void eatMarble() {
		if (left) {
			for (int i = 0; i < mContext.getMarbleList().size(); i++) {
				if (Math.abs(x - mContext.getMarble(i).getX()) < 15
						&& Math.abs(y - mContext.getMarble(i).getY()) < 15) {
					mContext.getMarble(i).setIcon(null);
					eatMarble = true;
					mContext.getMarble(i).setLocation(mContext.getMarble(i).setX(0), mContext.getMarble(i).setY(0));
					// 유령 멈추는 코드 라인
					// 구슬 좌표 남아있을 수 있음
				}
			}
			mContext.repaint();
		} // end of isLeft

		if (right) {
			for (int i = 0; i < mContext.getMarbleList().size(); i++) {
				if (Math.abs(x - mContext.getMarble(i).getX()) < 15
						&& Math.abs(y - mContext.getMarble(i).getY()) < 15) {
					mContext.getMarble(i).setIcon(null);
					eatMarble = true;
					mContext.getMarble(i).setLocation(0, 0);
					mContext.getMarble(i).setLocation(mContext.getMarble(i).setX(0), mContext.getMarble(i).setY(0));
				}
			}
			mContext.repaint();
		} // end of isRight

		if (up) {
			for (int i = 0; i < mContext.getMarbleList().size(); i++) {
				if (Math.abs(x - mContext.getMarble(i).getX()) < 15
						&& Math.abs(y - mContext.getMarble(i).getY()) < 15) {
					mContext.getMarble(i).setIcon(null);
					eatMarble = true;
					mContext.getMarble(i).setLocation(0, 0);
					mContext.getMarble(i).setLocation(mContext.getMarble(i).setX(0), mContext.getMarble(i).setY(0));
				}
			}
			mContext.repaint();
		} // end of isUp

		if (down) {
			for (int i = 0; i < mContext.getMarbleList().size(); i++) {
				if (Math.abs(x - mContext.getMarble(i).getX()) < 15
						&& Math.abs(y - mContext.getMarble(i).getY()) < 15) {
					mContext.getMarble(i).setIcon(null);
					eatMarble = true;
					mContext.getMarble(i).setLocation(0, 0);
					mContext.getMarble(i).setLocation(mContext.getMarble(i).setX(0), mContext.getMarble(i).setY(0));
				}
			}
			mContext.repaint();
		} // end of isDown
	}

} // end of class
