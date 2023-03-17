package com.project.order;

import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.project.order.controller.ProdController;
import com.project.order.dto.ProdDto;

public class OrderFrame extends JFrame{
	
	private TextArea area;
	private JButton selectButton;
	private JButton orderButton;
	private JTextField field1;
	private JPanel jPanel;
	private ProdController controller;
	private LoginFrame frame;
	
	public OrderFrame(LoginFrame frame) {
		this.frame = frame;
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("주문하기");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		area = new TextArea("", 10, 30, area.SCROLLBARS_VERTICAL_ONLY);
		area.setSize(300, 300);
		area.setEditable(false);
		jPanel = new JPanel();
		jPanel.setSize(600, 600);
		controller = new ProdController();
		selectButton = new JButton("상품조회");
		field1 = new JTextField();
		orderButton = new JButton("주문하기");
	}
	
	private void setInitLayout() {
		setLayout(null);
		jPanel.setLayout(null);
		add(jPanel);
		jPanel.add(area);
		jPanel.add(selectButton);
		jPanel.add(field1);
		jPanel.add(orderButton);
		field1.setBounds(170, 60, 100, 20);
		area.setBounds(40, 150, 500, 400);
		selectButton.setBounds(230, 30, 100, 20);
		orderButton.setBounds(320, 60, 100, 20);
		setResizable(false);
		setVisible(true);
	}
	
	private void addEventListener() {
		selectButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ArrayList<ProdDto> list = controller.requestAllProduct();
				for (int i = 0; i < list.size(); i++) {
					area.append(list.get(i).toString() + "\n");
				}
				
			}
		});
	}
	

} // end of class
