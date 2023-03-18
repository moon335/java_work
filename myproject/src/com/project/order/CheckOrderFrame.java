package com.project.order;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.project.order.controller.OrderController;
import com.project.order.dto.OrderDto;

public class CheckOrderFrame extends JFrame{
	
	private TextArea area;
	private JButton completeButton;
	private JButton backButton;
	private OrderController orderController;
	
	public CheckOrderFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("주문 확인");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		area = new TextArea("", 10, 30, area.SCROLLBARS_VERTICAL_ONLY);
		area.setEditable(false);
		completeButton = new JButton("주문 완료");
		backButton = new JButton("돌아가기");
		orderController = new OrderController();
		ArrayList<OrderDto> list = orderController.requestCheckOrder(LoginFrame.getLogindto().getId());
		for (int i = 0; i < list.size(); i++) {
			area.append(list.get(i).toString() + "\n");
		}
	}
	
	private void setInitLayout() {
		setLayout(null);
		add(area);
		add(backButton);
		add(completeButton);
		area.setBounds(50, 100, 500, 350);
		completeButton.setBounds(170, 480, 100, 30);
		backButton.setBounds(300, 480, 100, 30);
		setResizable(false);
		setVisible(true);
	}
	
	private void addEventListener() {
		completeButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new CompleteFrame();
				dispose();
			}
		});
		backButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new OrderFrame();
				dispose();
			}
		});
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Font font = new Font("CookieRun", Font.BOLD, 25);
		g.setFont(font);
		g.drawString("주문 목록", 240, 80);
	}
		
} // end of class
