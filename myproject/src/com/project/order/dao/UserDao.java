package com.project.order.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.project.order.dto.UserDto;
import com.project.order.utils.DBHelper;

public class UserDao implements IUserDao{

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public UserDao() {
		conn = DBHelper.getInstance().getConnection();
	}
	
	@Override
	public UserDto select(String userId, String password) {
		UserDto dto = new UserDto();
		String query = "SELECT * FROM user WHERE userId = ? AND password = ? ";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				dto.setUserId(rs.getString("userId"));
				dto.setPassword(rs.getString("password"));
				dto.setUserName(rs.getString("userName"));
				dto.setAddress(rs.getString("address"));
				dto.setTel(rs.getString("tel"));
			}
		} catch (Exception e) {
			System.out.println(">> userDao select()에서 오류 발생 <<");
			e.printStackTrace();
		}
		return dto;
	}
	
	@Override
	public UserDto select(String userId) {
		UserDto dto = new UserDto();
		String query = "SELECT * FROM user WHERE userId = ? ";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				dto.setUserId(rs.getString("userId"));
				dto.setPassword(rs.getString("password"));
				dto.setUserName(rs.getString("userName"));
				dto.setAddress(rs.getString("address"));
				dto.setTel(rs.getString("tel"));
			}
		} catch (Exception e) {
			System.out.println(">> userDao select()에서 오류 발생 <<");
			e.printStackTrace();
		}
		return dto;
	}

	@Override
	public int insert(UserDto targetUser) {
		int resultRow = 0;
		String query = " INSERT INTO user(userId, password, userName, address, tel) "
				+ " VALUES(?, ?, ?, ?, ?) ";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, targetUser.getUserId());
			pstmt.setString(2, targetUser.getPassword());
			pstmt.setString(3, targetUser.getUserName());
			pstmt.setString(4, targetUser.getAddress());
			pstmt.setString(5, targetUser.getTel());
			resultRow = pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(">> userDao insert()에서 오류 발생 <<");
			e.printStackTrace();
		}
		return resultRow;
	}

	@Override
	public UserDto select(int id) {
		// 추후 구현 예정
		return null;
	}
	
} // end of class
