package com.project.order.dao;

import java.util.ArrayList;

import com.project.order.dto.OrderDto;

public interface IOrderDao {
	
	int insertOrder(int userId, int prodId, int amount);
	
	ArrayList<OrderDto> selectOrder(int userId);
	
	int deleteOrder(int prodId);
	
	int deleteAllByUserId(int userId);
	
} // end of class
