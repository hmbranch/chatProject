package com.hmbranch.springchat.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home {
	
	@RequestMapping("")
	public String main(Model model) {
		model.addAttribute("name","홍길동");
		return "user/home";		
	}
}
