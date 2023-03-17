package com.project.order;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.project.order.controller.UserController;
import com.project.order.dto.UserDto;

public class LoginFrame extends JFrame{
	
	private JTextField jTextField1;
	private JPasswordField jTextField2;
	private JButton button1;
	private JButton button2;
	private UserController controller;
	private LoginFrame frame = this;
	private Image image;
	
	
	public LoginFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("로그인");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jTextField1 = new JTextField();
		jTextField1.setSize(100, 20);
		jTextField2 = new JPasswordField();
		jTextField2.setSize(100, 20);
		button1 = new JButton("로그인");
		button1.setSize(80, 20);
		button2 = new JButton("회원가입");
		button2.setSize(90, 20);
		controller = new UserController();
		image = new ImageIcon("배민로고1.png").getImage();
	}

	private void setInitLayout() {
		setLayout(null);
		setLayout(null);
		add(jTextField1);
		add(jTextField2);
		add(button1);
		add(button2);
		jTextField1.setLocation(90, 250);
		jTextField2.setLocation(200, 250);
		button1.setLocation(310, 250);
		button2.setLocation(390, 250);
		
		setResizable(false);
		setVisible(true);
	}
	

		@Override
		public void paint(Graphics g) {
			super.paint(g);
			Font font = new Font("CookieRun", Font.BOLD, 25);
			g.drawImage(image, 350, 170, 100, 100, null);
			g.setFont(font);
			g.drawString("배달시켜먹자", 200, 230);
		}

	
	public void addEventListener() {
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String result = controller.requestSignIn(jTextField1.getText(), jTextField2.getText());
				if(result.equals("로그인에 성공했습니다.")) {
					new OrderFrame(frame);
					dispose();
				} else {
					JOptionPane.showMessageDialog(frame, "아이디와 비밀번호를 확인해주세요.");
				}
			}
		});
		
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new SignUpFrame();
			}
		});
	}
	
	public static void main(String[] args) {
		new LoginFrame();
	}
	
} // end of class
