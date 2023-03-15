package com.tenco.blog.controller;

import com.tenco.blog.dto.BlogDTO;
import com.tenco.blog.service.BlogService;

public class BlogController {
	
	private BlogService blogService;
	
	public BlogController() {
		blogService = new BlogService();
	}
	
	
	// 블로그 글쓰기 기능
	public int reqSaveBoard(String title, String content, int userId) {
		// 방어적 코드
		int response = 0;
		if(userId != 0) {
			response = blogService.saveBoard(title, content, userId);
		}
		
		return response;
	}
	
	// 게시글 삭제 요청 받기
	public void requestBoardDelete(int boardId, int userId) {
		blogService.deleteBoard(boardId, userId);
	}
	
	// 특정 게시글 검색 요청 받기
	public BlogDTO requestBoardSelect(int boardId) {
		BlogDTO dto = blogService.selectByBoardId(boardId);
		
		return dto;
	}
	
} // end of class
