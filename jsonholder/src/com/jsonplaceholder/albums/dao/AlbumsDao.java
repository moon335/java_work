package com.jsonplaceholder.albums.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jsonplaceholder.albums.utils.DBHelper;

public class AlbumsDao implements IAlbumsDao{
	
	private Connection conn;
	private PreparedStatement pstmt;
	
	public AlbumsDao() {
		conn = DBHelper.getInstance().getConnection();
	}
	
	@Override
	public int insert(int userId, int id, String title) {
		int resultRow = 0;
		String query = " INSERT INTO albums(userId, id, title) "
				+ " VALUES (?, ?, ?) ";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, userId);
			pstmt.setInt(2, id);
			pstmt.setString(3, title);
			resultRow = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println(">> AlbumsDao insert()에서 오류가 발생 <<");
		}
		return resultRow;
	}
	
	
	
	
	
} // end of class
