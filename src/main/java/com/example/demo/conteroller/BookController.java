package com.example.demo.conteroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.BookDTO;
import com.example.demo.service.BookService;

@Controller
@RequestMapping("/board1")
public class BookController {

	@Autowired
	private BookService service;

	@GetMapping("/main")
	public void main() {

	}

	@GetMapping("/read1")
	public void read(int no, Model model) {
		BookDTO dto = service.read(no);
		model.addAttribute("dto", dto);
	}

//	// 수정화면
//	@GetMapping("/modify1")
//	public void modify(int no, Model model) {
//		BookDTO dto = service.read(no);
//		model.addAttribute("dto", dto);
//	}
//
//	// 수정처리
//	@PostMapping("/modify1")
//	public String modifyPost(BookDTO dto, RedirectAttributes redirectAttributes) {
//		service.modify(dto);
//		redirectAttributes.addAttribute("no", dto.getNo()); // ?no=1
//		return "redirect:/board1/read1";
//	}

	// 삭제처리
	@PostMapping("/remove")
	public String removePost(int no) {
		service.remove(no);
		return "redirect:/board1/main";
	}
}
