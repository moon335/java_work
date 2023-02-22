package ex08;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Bubble extends JLabel implements Moveable{
	
	// 버블의 위치 상태
	private int x;
	private int y;
	
	// 버블의 움직임 방향 상태
	private boolean left;
	private boolean right;
	private boolean up;
	
	// 적군을 맞춘 상태 : 0 기본 물방울, 1 적을 가둔 물방울
	private int state;
	
	private ImageIcon bubble; // 기본 물방을 이미지
	private ImageIcon bubbled; // 적을 가둔 상태 이미지
	private ImageIcon bomb; // 물방울이 터진 상태 이미지
	
	private Player player;
	private BackgroundBubbleService bubbleService;
	
	// 버블은 player에 의존하고 있다.
	public Bubble(Player player) {
		this.player = player;
		initData();
		setInitLayout();
		bubbleService = new BackgroundBubbleService(this);
		initThread();
	}
	
	private void initData() {
		bubble = new ImageIcon("images/bubble.png");
		bubbled = new ImageIcon("images/bubbled.png");
		bomb = new ImageIcon("images/bomb.png");
		left = false;
		right = false;
		up = false;
		state = 0;
	}
	
	private void setInitLayout() {
		// 플레이어가 있는 위치에 태어나야 한다.
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
					// 왼쪽 방향을 보고 있다.
					left();
				} else {
					// 오른쪽 방향을 보고 있다.
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
			// 체크 왼쪽 벽이야? --> break;
			if(bubbleService.leftWall()) {
				break;
			}
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} // end of for
		up();
	}

	@Override
	public void right() {
		right = true;
		for(int i = 0; i < 400; i++) {
			x++;
			setLocation(x, y);
			if(bubbleService.rightWall()) {
				break;
			}
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} // end of for
		up();
	}

	@Override
	public void up() {
		up = true;
		while(up) {
			y--;
			setLocation(x, y);
			if(bubbleService.topWall()) {
				break;
			}
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		clearBubble();
	}
	
	// 메서드 이름을 지정할 때는 행위(동사) -> (목적어)
	private void clearBubble() {
		try {
			Thread.sleep(3000);
			setIcon(bomb);
			// 터진 다음에 0.5초 뒤 그림 지우기
			Thread.sleep(500);
			setIcon(null);
			// this.setVisible(false); <-- 보이지만 않고 메모리에는 있음
			// repaint(); // 전체를 다시 그려서 부하가 큼
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
} // end of class
