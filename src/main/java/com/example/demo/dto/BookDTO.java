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
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookDTO {

	int no;
	
	String title;
	
	String content;
	
	String writer;
	
	int price;
	
	LocalDateTime regDate;
	
	LocalDateTime modDate;
}
