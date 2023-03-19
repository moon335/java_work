package com.project.order.dao;

import com.project.order.dto.UserDto;

public interface IUserDao {
	
	
	// 로그인을 위한 select
	UserDto select(String userId, String password);
	// 중복 검사를 위한 select
	UserDto select(String userId);
	// 주문을 위한 select
	UserDto select(int id);
	
	int insert(UserDto targetUser);
	
	
}
