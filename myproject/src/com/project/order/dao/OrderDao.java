package com.project.order.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.project.order.controller.ProdController;
import com.project.order.dto.OrderDto;
import com.project.order.dto.ProdDto;
import com.project.order.utils.DBHelper;

public class OrderDao implements IOrderDao{
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private ProdController prodController;
	
	public OrderDao() {
		conn = DBHelper.getInstance().getConnection();
		prodController = new ProdController();
	}

	@Override
	public int insertOrder(int userId, int prodId, int amount) {
		int resultRow = 0;
		int price = prodController.requestOneProduct(prodId).getPrice();
		String query = " INSERT INTO `order`(userId, prodId, orderDate, amount, priceSum) "
				+ " VALUES "
				+ "	(?, ?, now(), ?, (? * ?)) ";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, userId);
			pstmt.setInt(2, prodId);
			pstmt.setInt(3, amount);
			pstmt.setInt(4, price);
			pstmt.setInt(5, amount);
			resultRow = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultRow;
	}

	@Override
	public ArrayList<OrderDto> selectOrder(int userId) {
		ArrayList<OrderDto> list = new ArrayList<>();
		String query = "select u.userName, p.name, p.price,  o.amount, o.orderDate "
				+ " from `order` as o "
				+ " inner join product as p "
				+ " on o.prodId = p.id "
				+ " inner join user as u "
				+ " on o.userId = u.id "
				+ " WHERE o.userId = ? ";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, userId);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				OrderDto dto = new OrderDto();
				dto.setUserName(rs.getString("userName"));
				dto.setProdname(rs.getString("name"));
				dto.setPrice(rs.getInt("price"));
				dto.setAmount(rs.getInt("amount"));
				dto.setOrderDate(rs.getString("orderDate"));
				
				list.add(dto);
			}
			
		} catch (Exception e) {
			System.out.println(">> orderDao select에서 오류 발생 <<");
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int deleteOrder(int prodId) {
		int resultRow = 0;
		String query = "DELETE FROM `order` WHERE prodId = ? ";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, prodId);
			resultRow = pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(">> orderDao delete에서 오류 발생 <<");
			e.printStackTrace();
		}
		return resultRow;
	}

	@Override
	public int deleteAllByUserId(int userId) {
		int resultRow = 0;
		String query = "DELETE FROM `order` WHERE userId = ? ";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, userId);
			resultRow = pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(">> orderDao deleteAll에서 오류 발생 <<");
			e.printStackTrace();
		}
		return resultRow;
	}

	@Override
	public OrderDto selectAmountAndSum(int userId) {
		OrderDto dto = new OrderDto();
		String query = "SELECT count(amount) - 1 as '총 수량', sum(priceSum) as '합 금액' "
				+ " FROM `order` as o "
				+ " INNER JOIN product as p "
				+ " ON o.prodId = p.id "
				+ " WHERE o.userId = ? ";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, userId);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				dto.setAllAmount(rs.getInt("총 수량"));
				dto.setTotalPrice(rs.getInt("합 금액"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return dto;
	}

} // end of class
