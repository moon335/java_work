package com.project.order.controller;

import java.util.ArrayList;

import com.project.order.dto.OrderDto;
import com.project.order.service.OrderService;

public class OrderController {
	
	private OrderService orderService;
	
	public OrderController() {
		orderService = new OrderService();
	}
	
	// 주문 추가
	public String requestOrder(int userId, int prodId, int amount) {
		String responseOrder = orderService.saveOrder(userId, prodId, amount);
		return responseOrder;
	}
	
	// 주문 확인
	public ArrayList<OrderDto> requestCheckOrder(int userId) {
		ArrayList<OrderDto> responseList = orderService.checkOrder(userId);
		return responseList;
	}
	
	// 주문 취소
	public String requestCencelOrder(int prodId) {
		String responseCencel = orderService.cencelOrder(prodId);
		return responseCencel;
	}
	
	// 전체 취소
	public String requestAllCencel(int userId) {
		String responseCencel = orderService.cencelAll(userId);
		return responseCencel;
	}
	
	
} // end of class
