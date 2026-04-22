package com.green.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping("/")  // jsp 파일을 찾겠다 http://localhost:8080
	public String home() {
		return "home"; // home.jsp 
	}
	
	@RequestMapping("/test") // jsp가 아니라 불러온다는 뜻
	@ResponseBody // 서버가 data(html)을 내려보낸다
	public String test() {
		return "<h2>hello world!</h2>";
	}
}
