package ch04;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BuyDAO implements IBuyDAO{
	
	// db와 연결해주는 객체
	DBClient dbClient;
	
	public BuyDAO() {
		initData();
	}
	
	// 초기화 시키는 메서드
	private void initData() {
		dbClient = new DBClient();
	}

	@Override
	public ArrayList<BuyDTO> select() {
		
		ArrayList<BuyDTO> list = new ArrayList<>();
		
		// 연결하기
		Connection conn = dbClient.getConnection();
		
		// 문자열을 쿼리문으로 바꾸기
		Statement stmt = null;
		// 결과집합
		ResultSet rs = null;
		
		try {
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery("SELECT * FROM buyTBL");
			
			while(rs.next()) {
				String userName = rs.getString("userName");
				String prodName = rs.getString("prodName");
				int price = rs.getInt("price");
				int amount = rs.getInt("amount");
				BuyDTO dto = new BuyDTO(userName, prodName, price, amount);
				
				list.add(dto);
			}
		} catch (SQLException e) {
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
	public int insert(BuyDTO dto) {
		
		Connection conn = dbClient.getConnection();
		// 쿼리문 넣기
		String sqlFormat = "INSERT INTO buyTBL(userName, prodName, price, amount) "
				+ "VALUES('%s', '%s', %d, %d) ";
		String sql = String.format(sqlFormat, dto.getUserName(), dto.getProdName(), dto.getPrice(), dto.getAmount());
		
		Statement stmt = null;
		int resultRowCount = 0;
		try {
			stmt = conn.createStatement();
			resultRowCount = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
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
	public int update(BuyDTO dto, String targetUserName, String targetProdName) {
		
		String sqlFormat = "UPDATE buyTBL "
				+ "SET prodName = '%s', price = %d, amount = %d "
				+ "WHERE userName = '%s' AND prodName = '%s' ";
		String sql = String.format(sqlFormat, dto.getProdName(), dto.getPrice(), dto.getAmount(), targetUserName, targetProdName);
		
		Connection conn = dbClient.getConnection();
		Statement stmt = null;
		int resultRowCount = 0;
		try {
			stmt = conn.createStatement();
			resultRowCount = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
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
	public void delete(String userName) {
		
		String sqlFormat = "DELETE from buyTBL WHERE userName = '%s'";
		String sql = String.format(sqlFormat, userName);
		
		try(
			Connection conn = dbClient.getConnection();
			Statement stmt = conn.createStatement();
				) {
			stmt.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
} // end of class
