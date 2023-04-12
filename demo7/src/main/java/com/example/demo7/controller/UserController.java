package com.example.demo7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // IoC 처리 됨
public class UserController {
	
	// http://localhost:8080/
	// http://localhost:8080/user
	@GetMapping({"/", "user"})
	public String userPage(Model model) {
		// yml 파일 설정 
		// prefix : /WEB-INF/view/
		// subfix : .jsp 
		// /WEB-INF/view/user.jsp <-- 가 완성 됨 
		// viewResolver 가 동작해서 페이를 찾고 리턴
		// 데이터를 내려 보내고 싶다면
		model.addAttribute("principal", "헬로우~~");
		return "user";
	}
}
