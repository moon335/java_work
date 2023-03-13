package com.dennis0511.dennisblog.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dennis0511.dennisblog.dto.UserDTO;
import com.dennis0511.dennisblog.utils.DBHelper;

public class UserDAO implements IUserDAO{
	
	private DBHelper dbHelper;
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public UserDAO() {
		dbHelper = new DBHelper();
		conn = dbHelper.getConnection();
	}
	
	
	@Override
	public int saveUser(UserDTO user) {
		String query = "INSERT INTO user(username, password, email, address, userRole, createDate)\r\n"
				+ "VALUES (?, ?, ?, ?, ?, now());";
		int result = 0;
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getEmail());
			pstmt.setString(4, user.getAddress());
			pstmt.setString(5, user.getUserRole());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}


	@Override
	public UserDTO selectUserInfo(String username, String password) {
		
		String query = "SELECT * FROM user WHERE username = ? AND password = ? ";
		UserDTO resultDto = null;
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				UserDTO dto = new UserDTO();
				dto.setUsername(rs.getString("username"));
				dto.setEmail(rs.getString("email"));
				dto.setAddress(rs.getString("address"));
				resultDto = dto;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return resultDto;
	}


	@Override
	public String deleteUserInfo(String username) {
		
		String query = "DELETE FROM user WHERE username = ?";
		int resultRow = 0;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, username);
			resultRow = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultRow + "";
	}
	
	// 로그인 기능
	

} // end of class	
