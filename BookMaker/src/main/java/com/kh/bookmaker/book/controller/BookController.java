package com.kh.bookmaker.book.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.kh.bookmaker.book.model.service.BookService;
import com.kh.bookmaker.book.model.vo.Book;
import com.kh.bookmaker.common.util.Utils;

@Controller
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@RequestMapping("/book/bookList.do")
	public String selectBookList(@RequestParam(value="cPage", required=false, defaultValue="1") int cPage, Model model) {
		
		int numPerPage = 12;
		
		List<Book> list = bookService.selectBookList(cPage, numPerPage);
		
		int totalContents = bookService.selectBookTotalContents();
		
		String pageBar = Utils.getPageBar(totalContents, cPage, numPerPage, "bookList.do");
		
		model.addAttribute("list", list).addAttribute("pageBar", pageBar);
		
		return "book/bookList";
	}
	
	
}
