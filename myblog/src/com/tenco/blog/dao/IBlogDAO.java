package com.tenco.blog.dao;

import com.tenco.blog.dto.BlogDTO;

public interface IBlogDAO {
	
	int save(String title, String content, int userId);
	BlogDTO select(int boardId);
	void update ();
	void delete(int boardId);
	
} // end of interface
