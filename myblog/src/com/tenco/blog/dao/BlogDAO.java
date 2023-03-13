package com.tenco.blog.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.tenco.blog.utils.DBHelper;

public class BlogDAO implements IBlogDAO{
	
	private DBHelper dbHelper;
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public BlogDAO() {
		dbHelper = new DBHelper();
		conn = dbHelper.getConnection();
	}
	
	@Override
	public int save(String title, String content, int userId) {
		String query = "INSERT INTO board(title, content, userId) "
				+ " VALUES (?, ?, ?) ";
		int resultRow = 0;
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, title);
			pstmt.setString(2, content);
			pstmt.setInt(3, userId);
			resultRow = pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(">> blogDao save에서 에러남 <<");
			e.printStackTrace();
		}
		return resultRow;
	}

	@Override
	public void select() {
		
	}

	@Override
	public void update() {
		
	}

	@Override
	public void delete(int boardId) {
		String query = "DELETE FROM board WHERE id = ? ";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, boardId);
			pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(">>> blogDao delete 에러 발생 <<<");
			e.printStackTrace();
		}
		
	}
	
} // end of class
