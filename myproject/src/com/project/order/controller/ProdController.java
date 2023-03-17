package com.project.order.controller;

import java.util.ArrayList;

import com.project.order.dto.ProdDto;
import com.project.order.service.ProdService;

public class ProdController {
	
	private ProdService prodService;
	
	public ProdController() {
		prodService = new ProdService();
	}
	
	public ArrayList<ProdDto> requestAllProduct() {
		ArrayList<ProdDto> response = prodService.selectAllProduct();
		return response;
	}
	public ProdDto requestOneProduct(String prodname) {
		ProdDto responseDto = prodService.selectOneProduct(prodname);
		return responseDto;
	}
	
} // end of class
