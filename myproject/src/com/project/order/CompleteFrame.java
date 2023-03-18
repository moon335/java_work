package com.project.order;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CompleteFrame extends JFrame{
	
	private JButton button;
	private DateTimeFormatter dateTimeFormatter;
	private LocalDateTime nowDateTime;
	
	public CompleteFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("주문 완료");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("확인");
		dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy년MM월dd일 HH시mm분");
		nowDateTime = LocalDateTime.now();
	}
	
	private void setInitLayout() {
		setLayout(null);
		add(button);
		button.setBounds(240, 500, 100, 30);
		setResizable(false);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Font font = new Font("CookieRun", Font.BOLD, 25);
		g.setFont(font);
		g.drawString("주문 완료", 238, 80);
		g.drawLine(0, 100, 600, 100);
		Font font2 = new Font("CookieRun", Font.BOLD, 20);
		g.setFont(font2);
		g.drawString("매장에서 주문을 접수 중입니다...", 30, 130);
		g.drawString("주문일자: ", 30, 160);
		g.drawString(nowDateTime.format(dateTimeFormatter), 140, 160);
	}
	
	private void addEventListener() {
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
	
} // end of class
