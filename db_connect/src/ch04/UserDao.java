package ch04;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class UserDao implements IuserDao {

	private DBClient dbClient;

	public UserDao() {
		initData();
	}

	private void initData() {
		dbClient = new DBClient();
	}

	@Override
	public ArrayList<UserDTO> select() {

		ArrayList<UserDTO> list = new ArrayList<>();
		// 코드 구현
		Connection conn = dbClient.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM userTBL");

			while (rs.next()) {
				String userName = rs.getString("userName");
				String birthYear = rs.getString("birthYear");
				String addr = rs.getString("addr");
				String mobile = rs.getString("mobile");

				UserDTO dto = new UserDTO(userName, birthYear, addr, mobile);

				list.add(dto);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		return list;
	}

	@Override
	public int insert(UserDTO dto) {
		String sqlFormat = "INSERT INTO userTBL(userName, birthYear, addr, mobile) "
				+ "VALUES('%s', '%s', '%s', '%s') ";
		String sql = String.format(sqlFormat, dto.getUserName(), dto.getBirthYear(), dto.getAddr(), dto.getMobile());
		Connection conn = dbClient.getConnection();
		int resultRowCount = 0;
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			resultRowCount = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			System.err.println("잘 확인해주세요");
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return resultRowCount;
	}

	@Override
	public int update(UserDTO dto, String targetUserName) {

		String sqlFormat = "UPDATE userTBL " + "	SET birthYear = '%s', addr = '%s', mobile = '%s' "
				+ "    WHERE userName = '%s' ";

		String sql = String.format(sqlFormat, dto.getBirthYear(), dto.getAddr(), dto.getMobile(), targetUserName);

		int resultRow = 0;

		try (Connection conn = dbClient.getConnection(); 
				Statement stmt = conn.createStatement();) {
			resultRow = stmt.executeUpdate(sql);

		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("확인바람");
		}

		return resultRow;
	}

	@Override
	public boolean delete(String targetUserName) {
		
		boolean isOk = true;
		
		String sqlFormat = "DELETE from userTBL WHERE userName = '%s';";
		String sql = String.format(sqlFormat, targetUserName);
		
		Connection conn = dbClient.getConnection();
		Statement stmt = null;

		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
		// 실행의 흐름이 여기로 빠졌을 경우
		// 구매 테이블에 데이터가 남아 있어서
		// 유저 테이블에 삭제가 불가능 하다.
			isOk = false;
		} catch (Exception e) {
			
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return isOk;
	}

} // end of class
