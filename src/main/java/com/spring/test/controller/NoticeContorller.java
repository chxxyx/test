package com.spring.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NoticeContorller {

	@RequestMapping("/notice/list")
	public String list() {
		
		return "/client/notice/list";
	}
	
}
