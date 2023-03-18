package com.project.order.service;

import java.util.ArrayList;

import com.project.order.dao.OrderDao;
import com.project.order.dto.OrderDto;

public class OrderService {
	
	private OrderDao orderDao;
	
	public OrderService() {
		orderDao = new OrderDao();
	}
	
	public String saveOrder(int userId, int prodId, int amount) {
		int resultRow = orderDao.insertOrder(userId, prodId, amount);
		String result = "주문 내역을 다시 확인해주세요.";
		if(resultRow != 0) {
			result = "주문에 성공했습니다.";
		}
		return result;
	}
	
	public ArrayList<OrderDto> checkOrder(int userId) {
		ArrayList<OrderDto> resultList = orderDao.selectOrder(userId);
		return resultList;
	}
	
	public String cencelOrder(int prodId) {
		int resultRow = orderDao.deleteOrder(prodId);
		String result = "취소에 실패했습니다.";
		if(resultRow != 0) {
			result = "취소에 성공했습니다.";
		}
		return result;
	}
	
	public String cencelAll(int userId) {
		int resultRow = orderDao.deleteAllByUserId(userId);
		String result = "주문 취소에 실패했습니다.";
		if(resultRow != 0) {
			result = "주문이 취소되었습니다.";
		}
		return result;
	}
	
} // end of class
