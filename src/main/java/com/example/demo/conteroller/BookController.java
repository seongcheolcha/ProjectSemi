package com.example.demo.conteroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board1")
public class BookController {

	
//	@Autowired
//	BoardService service;

	@GetMapping("/main")
	public void main() {

	}
}
