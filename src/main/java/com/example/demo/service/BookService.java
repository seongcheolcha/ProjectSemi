package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.BookDTO;

public interface BookService {

int register(BookDTO dto);
	
	List<BookDTO> getliList();
}
