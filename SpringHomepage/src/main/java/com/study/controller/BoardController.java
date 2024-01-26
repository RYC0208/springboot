package com.study.controller;

import com.study.domain.Board;
import com.study.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.study.service.BoardService;

@Controller
public class BoardController {

	@Autowired
	BoardService boardService;
	
	@GetMapping("/list")
	public String list(@RequestParam(value="nowPage", defaultValue="0") int nowPage, 
						Model model) 
	{
														// PageRequest.of(현재페이지, 페이지당 개수[, sort])
		model.addAttribute("boardPage", boardService.list(PageRequest.of(nowPage, 10))) ;
		model.addAttribute("nowPage", nowPage);
		return "board/list";
	}

	@GetMapping("/insertForm")
	public String insertForm() throws Exception {
		return "board/insertForm";
	}
	@PostMapping("/insert")
	public String insertBoard(Board board){
		Board insertedBoard = boardService.insertBoard(board);

		return "redirect:/list";
	}

}










