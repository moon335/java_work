package ch02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MainTest02 {

	public static void main(String[] args) {
		
		ArrayList<BuyTBL> buyTBL = new ArrayList<>();
		
		// 코드 실행
		DBClient dbClient = new DBClient();
		// mydb
//		dbClient.setDB_NAME("shopdb");
		DBClient.setDB_NAME("shopdb");
		
		// DB 접근 구현 코드 처리
		// 자료구조 선언, 담을 데이터를 클래스로 모델링
		Connection conn = dbClient.getConnection();
		Statement stat = null;
		ResultSet rs = null;
		try {
			// 문자열을 쿼리문으로 반환
			stat = conn.createStatement();
			
			String query = "select * from buyTBL";
			// 결과집합
			rs = stat.executeQuery(query);
			
			while(rs.next()) {
				BuyTBL tbl = new BuyTBL(rs.getString("userName"), rs.getString("prodName"),
						rs.getInt("price"), rs.getInt("amount"));
				buyTBL.add(tbl);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stat.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		for (int i = 0; i < buyTBL.size(); i++) {
			System.out.println(buyTBL.get(i));
		}
		
	} // end of main

} // end of class

class BuyTBL {
	
	private String userName;
	private String prodName;
	private int price;
	private int amount;
	
	public BuyTBL(String userName, String prodName, int price, int amount) {
		super();
		this.userName = userName;
		this.prodName = prodName;
		this.price = price;
		this.amount = amount;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "BuyTBL [userName=" + userName + ", prodName=" + prodName + ", price=" + price + ", amount=" + amount
				+ "]";
	}
	
}
