package com.dennis0511.dennisblog.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {
	
	// 기본 정보
	private static final String DB_HOST = "localhost";
	private static final String DB_PORT = "3306";
	private static final String DB_DATABASE_NAME = "myblog";
	private static final String DB_CHARSET = "UTF-8";
	private static final String DB_USER = "bloguser";
	private static final String DB_PASSWORD = "1q2w3e4r5t";
	
	// 연결 객체
	private Connection conn;
	
	
	public Connection getConnection() {
		if(conn == null) {
			String urlFormat = "jdbc:mysql://%s:%s/%s?serverTimezone=Asia/Seoul&characterEncoding=%s";
			String url = String.format(urlFormat, DB_HOST, DB_PORT, DB_DATABASE_NAME, DB_CHARSET);
			
			try {
				// 드라이버 가져오기
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection(url, DB_USER, DB_PASSWORD);
				System.out.println("db 연결 성공");
			} catch (Exception e) {
				System.out.println("db 연결 실패");
				e.printStackTrace();
			}
		}
		return conn;
	}
	
	public void closeConnection() {
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
} // end of class
