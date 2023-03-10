package ch05;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

// 실제 db에 접근해서 기능을 처리해주는 녀석
public class EmployeeDAO implements IEmployeeDAO{
	
	private DBHelper dbHelper;
	private Connection conn;
	// private Statement stmt;
	// statement의 기능확장 좀 더 빠름, cash 기반
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public EmployeeDAO() {
		// dbHelper.getConnection().createStatement().executeQuery(null);
		// DBHelper 객체를 가지고 오는 동작
		dbHelper = DBHelper.getInstance();
		// dbHelper에서 connection 객체를 가지고 오는 동작
		conn = dbHelper.getConnection();
	} // end of constructor

	@Override
	public ArrayList<EmployeeDTO> showTitleEmpInfo(String title) {
		
		ArrayList<EmployeeDTO> list = new ArrayList<>();
		
		String sql = " SELECT e.emp_no, e.first_name, e.last_name, t.title "
				+ " FROM employees AS e "
				+ " INNER JOIN titles AS t "
				+ " ON e.emp_no = t.emp_no "
				+ " WHERE t.title = ? "
				+ " LIMIT 500 ";
		// prepareStatement 시작 번호는 1번부터 시작한다. 문자열은 '' 생략 가능 그냥 ? 기반으로 사용 가능
		try {
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, title);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				EmployeeDTO dto = new EmployeeDTO();
				dto.setEmpNo(rs.getString("emp_no"));
				dto.setFirstName(rs.getString("first_name"));
				dto.setLastName(rs.getString("last_name"));
				dto.setTitle(rs.getString("title"));
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	@Override
	public ArrayList<EmployeeDTO> salaryCount(String firstName, String lastName) {

		ArrayList<EmployeeDTO> list = new ArrayList<>();
		
		String sql = "SELECT e.first_name, e.last_name, count(s.salary) as '연봉 받은 횟수' "
				+ " FROM employees AS e "
				+ " INNER JOIN salaries AS s "
				+ " ON e.emp_no = s.emp_no "
				+ " GROUP BY e.emp_no "
				+ " HAVING e.first_name = ? "
				+ "	AND e.last_name = ? ";
		
		try {
			pstmt = conn.prepareStatement(sql);
			// 맵핑
			pstmt.setString(1, firstName);
			pstmt.setString(2, lastName);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				EmployeeDTO dto = new EmployeeDTO();
				dto.setFirstName(rs.getString("first_name"));
				dto.setLastName(rs.getString("last_name"));
				dto.setCount(rs.getString("연봉 받은 횟수"));
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}

	@Override
	public int insert(EmployeeDTO dto) {
		
		String sql = "INSERT INTO employees(emp_no, birth_date, first_name, last_name, gender, hire_date) "
				+ " VALUES "
				+ "	(?, ?, ?, ?, ?, ?) ";
		int resultRowcount = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getEmpNo());
			pstmt.setString(2, dto.getBirthDate());
			pstmt.setString(3, dto.getFirstName());
			pstmt.setString(4, dto.getLastName());
			pstmt.setString(5, dto.getGender());
			pstmt.setString(6, dto.getHireDate());
			resultRowcount = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return resultRowcount;
	}
	
	
	
	
} // end of class
