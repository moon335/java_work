package com.project.order;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.project.order.controller.UserController;
import com.project.order.dto.UserDto;

public class SignUpFrame extends JFrame{
	
	private JTextField idField;
	private JTextField passwordField;
	private JTextField nameField;
	private JTextField addressField;
	private JTextField telField;
	private JButton joinButton;
	private JButton cancelButton;
	private UserController controller;
	private SignUpFrame frame = this;
	
	public SignUpFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("회원가입");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		idField = new JTextField();
		idField.setSize(100, 20);
		passwordField = new JTextField();
		passwordField.setSize(100, 20);
		nameField = new JTextField();
		nameField.setSize(100, 20);
		addressField = new JTextField();
		addressField.setSize(100, 20);
		telField = new JTextField();
		telField.setSize(100, 20);
		joinButton = new JButton("가입하기");
		joinButton.setSize(90, 20);
		cancelButton = new JButton("취소");
		cancelButton.setSize(90, 20);
		controller = new UserController();
	}
	
	private void setInitLayout() {
		setLayout(null);
		add(idField);
		add(passwordField);
		add(nameField);
		add(addressField);
		add(telField);
		add(joinButton);
		add(cancelButton);
		idField.setLocation(350,  70);
		passwordField.setLocation(350,  120);
		nameField.setLocation(350,  170);
		addressField.setLocation(350,  220);
		telField.setLocation(350,  270);
		joinButton.setLocation(200,  350);
		cancelButton.setLocation(300,  350);
		setResizable(false);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Font font = new Font("CookieRun", Font.BOLD, 25);
		g.setFont(font);
		g.drawString("회원가입", 250, 70);
		Font font2 = new Font("CookieRun", Font.BOLD, 15);
		g.setFont(font2);
		g.drawString("아이디", 200, 115);
		g.drawString("비밀번호", 200, 165);
		g.drawString("이름", 200, 215);
		g.drawString("주소", 200, 265);
		g.drawString("전화번호", 200, 315);
	}
	
	public void addEventListener() {
		joinButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				UserDto dto = new UserDto(idField.getText(), passwordField.getText(), nameField.getText(), addressField.getText(), telField.getText());
				String result = controller.requestSignUp(dto);
				if(result.equals("회원가입에 성공했습니다.")) {
					JOptionPane.showMessageDialog(frame.getContentPane(), "회원가입에 성공 했습니다.");
					dispose();
				} else if(result.equals("중복된 아이디가 존재합니다.")){
					JOptionPane.showMessageDialog(frame.getContentPane(), "중복된 아이디가 존재합니다.");
				} else {
					JOptionPane.showMessageDialog(frame.getContentPane(), "회원가입에 실패했습니다.");
				}
			}
		});
		
		cancelButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
	
	
	
	
} // end of class
