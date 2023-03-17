package com.project.order.dto;

public class OrderDto {
	
	private int id;
	private int userId;
	private int prodId;
	private String orderDate;
	private int amount;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "OrderDto [userId=" + userId + ", prodId=" + prodId + ", orderDate=" + orderDate + ", amount=" + amount
				+ "]";
	}
	
} // end of class
