package ch05;

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
	private EmployeeDAO employeeDAO;
//	private JScrollPane scrollPane;
	private JPanel panel;
	private TextArea area;
	
	public DBFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("직원 조회 프로그램");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		button1 = new JButton("조회");
		button2 = new JButton("삭제");
		textField1 = new JTextField();
		employeeDAO = new EmployeeDAO();
		area = new TextArea("", 10, 30, area.SCROLLBARS_VERTICAL_ONLY);
		area.setEditable(false);
//		scrollPane = new JScrollPane(area);
	}
	
	private void setInitLayout() {
		panel.add(button1);
		panel.add(button2);
		panel.add(textField1);
		panel.add(area);
//		panel.add(scrollPane);
		add(panel);
		panel.setLayout(null);
		button1.setBounds(305, 30, 60, 20);
		button2.setBounds(370, 30, 60, 20);
		textField1.setBounds(200, 30, 100, 20);
//		scrollPane.setBounds(531, 100, 20, 400);
		area.setBounds(30, 100, 500, 400);
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
	
	
	// 코드 테스트
	public static void main(String[] args) {
		new DBFrame();
	}
	
} // end of class
