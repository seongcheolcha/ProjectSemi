package com.example.demo.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString; 

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder

public class BookDTO {

	private int no;
	private String title;
	private String content;
	private String writer;
	private String price;
	private LocalDateTime regDate;
	private LocalDateTime modDate;
	
}