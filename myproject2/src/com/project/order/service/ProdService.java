package com.project.order.service;

import java.util.ArrayList;

import com.project.order.dao.ProdDao;
import com.project.order.dto.ProdDto;

public class ProdService {
	
	private ProdDao dao;
	
	public ProdService() {
		dao = new ProdDao();
	}
	
	public ArrayList<ProdDto> selectAllProduct() {
		ArrayList<ProdDto> result = dao.selectAll();
		return result;
	}
	
	public ProdDto selectOneProduct(String prodname) {
		ProdDto result = dao.select(prodname);
		return result;
	}
	
} // end of class
