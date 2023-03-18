package com.project.order;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.project.order.controller.OrderController;
import com.project.order.controller.ProdController;
import com.project.order.controller.UserController;
import com.project.order.dto.OrderDto;
import com.project.order.dto.ProdDto;
import com.project.order.dto.UserDto;

public class OrderFrame extends JFrame{
	
	private TextArea area;
	private JButton selectButton;
	private JButton orderButton;
	private JButton addButton;
	private JButton deleteButton;
	private JButton deleteAllButton;
	private JTextField field1;
	private JTextField field2;
	private MyPanel jPanel;
	private ProdController prodController;
	private UserController userController;
	private OrderController orderController;
	
	public OrderFrame() {
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
		jPanel = new MyPanel();
		jPanel.setSize(600, 600);
		prodController = new ProdController();
		userController = new UserController();
		orderController = new OrderController();
		selectButton = new JButton("상품조회");
		field1 = new JTextField();
		field2 = new JTextField();
		orderButton = new JButton("주문확인");
		addButton = new JButton("추가하기");
		deleteButton = new JButton("주문 취소");
		deleteAllButton = new JButton("전체 취소");
	}
	
	private void setInitLayout() {
		setLayout(null);
		jPanel.setLayout(null);
		add(jPanel);
		jPanel.add(area);
		jPanel.add(selectButton);
		jPanel.add(field1);
		jPanel.add(field2);
		jPanel.add(orderButton);
		jPanel.add(addButton);
		jPanel.add(deleteButton);
		jPanel.add(deleteAllButton);
		field1.setBounds(120, 80, 100, 20);
		field2.setBounds(230, 80, 100, 20);
		area.setBounds(40, 150, 500, 400);
		selectButton.setBounds(230, 30, 100, 20);
		orderButton.setBounds(450, 110, 100, 20);
		deleteAllButton.setBounds(340, 110, 100, 20);
		addButton.setBounds(340, 80, 100, 20);
		deleteButton.setBounds(450, 80, 100, 20);
		setResizable(false);
		setVisible(true);
	}
	
	private void addEventListener() {
		selectButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ArrayList<ProdDto> list = prodController.requestAllProduct();
				for (int i = 0; i < list.size(); i++) {
					area.append(list.get(i).toString() + "\n");
				}
			}
		});
		
		deleteButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ProdDto pDto = prodController.requestOneProduct(field1.getText());
				String result = orderController.requestCencelOrder(pDto.getId());
				if(result.equals("취소에 실패했습니다.")) {
					JOptionPane.showMessageDialog(rootPane, "주문 목록에 없는 상품입니다.");
				} else {
					JOptionPane.showMessageDialog(rootPane, field1.getText() + "이(가) 주문 목록에서 삭제되었습니다.");
				}
			}
		});
		
		addButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				UserDto uDto = userController.requestUserInfo(LoginFrame.getLogindto().getUserId(), LoginFrame.getLogindto().getPassword());
				ProdDto pDto = prodController.requestOneProduct(field1.getText());
				
				if(field1.getText().equals("")) {
					JOptionPane.showMessageDialog(rootPane, "상품 이름을 입력해주세요.");
				} else if (field2.getText().equals("")) {
					JOptionPane.showMessageDialog(rootPane, "주문 수량을 입력해주세요.");
				}
				
				if(pDto.getName() == null) {
					JOptionPane.showMessageDialog(rootPane, "주문 목록에 없는 상품입니다.");
				} else {
					orderController.requestOrder(uDto.getId(), pDto.getId(), Integer.parseInt(field2.getText()));
					JOptionPane.showMessageDialog(rootPane, "추가에 성공했습니다.");
				}
			}
		});
		
		orderButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ArrayList<OrderDto> list = orderController.requestCheckOrder(LoginFrame.getLogindto().getId());
				if(list.size() == 0) {
					JOptionPane.showMessageDialog(rootPane, "주문 목록이 비어 있습니다.");
				} else {
					new CheckOrderFrame();
					dispose();
				}
			}
		});
		
		deleteAllButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ArrayList<OrderDto> list = orderController.requestCheckOrder(LoginFrame.getLogindto().getId());
				if(list.size() == 0) {
					JOptionPane.showMessageDialog(rootPane, "주문 목록이 비어 있습니다.");
				} else {
					orderController.requestAllCencel(LoginFrame.getLogindto().getId());
					JOptionPane.showMessageDialog(rootPane, "전체 삭제에 성공했습니다.");
				}
			}
		});
	}
	
	class MyPanel extends JPanel {
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			Font font = new Font("CookieRun", Font.BOLD, 13);
			g.setFont(font);
			g.drawString("상품 이름", 140, 70);
			g.drawString("주문 수량", 250, 70);
		}
	}
	
	public static void main(String[] args) {
		new OrderFrame();
	}
	
} // end of class
