package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.BookDTO;

public interface BookService {

int register(BookDTO dto);
	
//게시물 목록조회
	List<BookDTO> getList();

	// 게시물 상세조회
	BookDTO read(int no);

//	// 게시물 수정
//	void modify(BookDTO dto);

	// 게시물 삭제
	int remove(int no);

	
	
}