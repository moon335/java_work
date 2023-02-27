package ch18;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GameOverFrame extends JFrame implements ActionListener {
	private JLabel gameOverMap;
	private JButton startButton;
	private JLabel gameOver;

	public GameOverFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("팩맨");
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameOverMap = new JLabel(new ImageIcon("images/gameEndMap.jpg"));
		setContentPane(gameOverMap);
		startButton = new JButton("Game Start!");
		gameOver = new JLabel(new ImageIcon("images/gameOver.png"));
	}

	private void setInitLayout() {
		setVisible(true);
		gameOverMap.add(startButton);
		startButton.setSize(200, 50);
		startButton.setLocation(290, 600);
		startButton.setBorderPainted(false);
		startButton.setBackground(Color.yellow);
		gameOver.setSize(800, 200);
		gameOver.setLocation(10, 300);
		add(gameOver);
	}

	private void addEventListener() {
		startButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton startButton = (JButton) e.getSource();
		new PacManFrame();
		setVisible(false);
	}

	public void paint(Graphics g) {
		super.paint(g);
		Font font1 = new Font("consolas", Font.BOLD, 20);
		g.setFont(font1);
		g.setColor(Color.white);
		g.drawString("Try Again!", 340, 590);
	}
}
