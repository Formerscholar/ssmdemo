package com.chad.controller;

import com.alibaba.fastjson.JSONObject;
import com.chad.model.Books;
import com.chad.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BooksController {
	
	@Autowired
	private BooksService booksService;
	
	@GetMapping("/test")
	public JSONObject test() {
		
		JSONObject jsonObject = new JSONObject();
		
		Books books = new Books();
		books.setBookName("asfasgags");
		books.setBookCounts(2);
		books.setDetail("新增");
		booksService.testInsert(books);
		
		jsonObject.put("title", "测试成功" + books.getBookId());
		return jsonObject;
	}
}
