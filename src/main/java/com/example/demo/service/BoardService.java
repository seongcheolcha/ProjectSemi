package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.BoardDTO;
import com.example.demo.entity.Board;

public interface BoardService {

	int register(BoardDTO dto);
	
	List<BoardDTO> getList();
	
	
	BoardDTO read(int no);
	
	default Board dtoToEntity(BoardDTO dto) {
		
		Board entity = Board.builder()
								.no(dto.getNo())
								.title(dto.getTitle())
								.content(dto.getContent())
								.writer(dto.getWriter())
								.price(dto.getPrice())
								.build();
		
		return entity;
	}
	
	
	default BoardDTO entityToDto(Board entity) {
		
		BoardDTO dto = BoardDTO.builder()
									.no(entity.getNo())
									.title(entity.getTitle())
									.content(entity.getContent())
									.writer(entity.getWriter())
									.price(entity.getPrice())
									.regDate(entity.getRegDate())
									.modDate(entity.getModDate()).build();
		
		return dto;
		
	}
	
	void modify(BoardDTO dto);
	
	
	int remove(int no);
}
