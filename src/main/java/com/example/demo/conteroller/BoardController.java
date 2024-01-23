package com.example.demo.conteroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.dto.BoardDTO;
import com.example.demo.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	BoardService service;

	@GetMapping("/main")
	public void main() {

	}

	@GetMapping("/list")
	public void list(org.springframework.ui.Model model) {

		List<BoardDTO> list = service.getList();

		model.addAttribute("list", list);
	}

	@GetMapping("/register")
	public void register() {

	}

	@GetMapping("/register")
	public String registerPost(BoardDTO dto, RedirectAttributes redirectAttributes) {

		// 게시물 등록, 새로운 게시물 번호 반환
		int no = service.register(dto);

		// 목록화면에 새로운 게시물 번호 전달
		redirectAttributes.addFlashAttribute("msg", no);

		// 목록화면으로 이동. url주소로 작성해야함
		return "redirect:/board/list";

	}
}
