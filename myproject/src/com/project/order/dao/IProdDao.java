package com.project.order.dao;

import java.util.ArrayList;

import com.project.order.dto.ProdDto;

public interface IProdDao {
	
	// 전체 상품 조회
	ArrayList<ProdDto> selectAll();
	
	// 특정 상품 조회
	ProdDto select(String prodname);
	
	
}
