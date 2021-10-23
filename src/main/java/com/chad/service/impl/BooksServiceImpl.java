package com.chad.service.impl;

import com.chad.mapper.BooksMapper;
import com.chad.model.Books;
import com.chad.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BooksServiceImpl implements BooksService {
	
	@Autowired
	private BooksMapper booksMapper;
	
	@Override
	public Long testInsert(Books books) {
		return booksMapper.insert(books);
	}
}
