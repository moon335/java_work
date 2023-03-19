package com.project.order.frames;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import com.project.order.controller.OrderController;
import com.project.order.dto.OrderDto;

public class CompleteFrame extends JFrame{
	
	private JButton button;
	private DateTimeFormatter dateTimeFormatter;
	private LocalDateTime nowDateTime;
	private LoginFrame mContext;
	private OrderController orderController;
	private Image image;
	private CheckOrderFrame mContext2;
	
	public CompleteFrame(LoginFrame mContext, CheckOrderFrame mContext2) {
		this.mContext = mContext;
		this.mContext2 = mContext2;
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
		orderController = new OrderController();
		image = new ImageIcon("images/배민아이콘.png").getImage();
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
		g.drawImage(image, 335, 106, 30, 30, null);
		g.drawString("주문일자: ", 30, 160);
		g.drawString(nowDateTime.format(dateTimeFormatter), 140, 160);
		OrderDto resultPriceAndAmount = orderController.requestAllPriceAndSum(mContext.getLogindto().getId());
		if(mContext2.getList().size() == 1) {
			g.drawString("주문하신 메뉴는", 30, 190);
			g.drawString(mContext2.getList().get(0).getProdname() + " 입니다.", 188, 190);
			g.drawString("결제금액", 30, 220);
			g.drawString(orderController.requestAllPriceAndSum(mContext.getLogindto().getId()).getTotalPrice() + "원", 120, 220);
		} else {
			g.drawString("주문하신 메뉴는", 30, 190);
			g.drawString(mContext2.getList().get(0).getProdname() + "외 " + resultPriceAndAmount.getAllAmount() + "개 입니다.", 188, 190);
			g.drawString("결제금액은", 30, 220);
			g.drawString(resultPriceAndAmount.getTotalPrice() + "원 입니다.", 140, 220);
		}
	}
	
	private void addEventListener() {
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				orderController.requestAllCencel(mContext.getLogindto().getId());
				dispose();
			}
		});
	}
	
} // end of class
