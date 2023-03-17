package com.project.order.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.project.order.dto.ProdDto;
import com.project.order.utils.DBHelper;

public class ProdDao implements IProdDao{

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public ProdDao() {
		conn = DBHelper.getInstance().getConnection();
	}
	
	@Override
	public ArrayList<ProdDto> selectAll() {
		ArrayList<ProdDto> list = new ArrayList<>();
		String query = "SELECT * FROM product ";
		
		try {
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ProdDto dto = new ProdDto();
				dto.setId(rs.getInt("id"));
				dto.setName(rs.getString("name"));
				dto.setPrice(rs.getInt("price"));
				
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public ProdDto select(String prodname) {
		ProdDto dto = new ProdDto();
		String query = "SELECT * FROM product WHERE name = ? ";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, prodname);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				dto.setId(rs.getInt("id"));
				dto.setName(rs.getString("name"));
				dto.setPrice(rs.getInt("price"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return dto;
	}
	
	
} // end of class
