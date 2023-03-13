package ch05;

import java.awt.Graphics;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DBFrame extends JFrame{
	
	private JButton button1;
	private JButton button2;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private EmployeeDAO employeeDAO;
	private MyPanel panel;
	private TextArea area;
	
	public DBFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("DB 연결 프로그램");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new MyPanel();
		button1 = new JButton("조회");
		button2 = new JButton("글 삭제");
		textField1 = new JTextField();
		textField2 = new JTextField();
		textField3 = new JTextField();
		employeeDAO = new EmployeeDAO();
		area = new TextArea("", 10, 30, area.SCROLLBARS_VERTICAL_ONLY);
		area.setEditable(false);
	}
	
	private void setInitLayout() {
		panel.add(button1);
		panel.add(button2);
		panel.add(textField1);
		panel.add(textField2);
		panel.add(textField3);
		panel.add(area);
		add(panel);
		panel.setLayout(null);
		button1.setBounds(305, 30, 60, 20);
		button2.setBounds(370, 30, 80, 20);
		textField1.setBounds(200, 30, 100, 20);
		textField2.setBounds(30, 100, 50, 20);
		textField3.setBounds(95, 100, 60, 20);
		area.setBounds(30, 200, 500, 300);
		setResizable(false);
		setVisible(true);
	}
	
	private void addEventListener() {
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setText();
			}
		});
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				deleteText();
			}
		});
	}
	
	public void setText() {
		ArrayList<EmployeeDTO> list = employeeDAO.showTitleEmpInfo(textField1.getText());
		for (int i = 0; i < list.size(); i++) {
				area.append(list.get(i).getEmpNo() + " ");
				area.append(list.get(i).getFirstName() + " ");
				area.append(list.get(i).getLastName() + " ");
				area.append(list.get(i).getTitle() + " ");
				area.append("\n");
		}
	}
	
	public void deleteText() {
		area.setText(" ");
	}
	
	class MyPanel extends JPanel {
		
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawString("직함을 입력해주세요", 200, 20);
			g.drawString("추가 할 데이터를 입력해 주세요.", 180, 70);
			g.drawString("직원번호", 30, 90);
			g.drawString("생년월일", 100, 90);
			g.drawString("이름", 170, 90);
			g.drawString("성", 240, 90);
			g.drawString("성별", 310, 90);
			g.drawString("고용일자", 380, 90);
		}
	}
	
	// 코드 테스트
	public static void main(String[] args) {
		new DBFrame();
	}
	
} // end of class
