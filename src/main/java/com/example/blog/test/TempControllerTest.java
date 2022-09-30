package com.example.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TempControllerTest {
	
	// http://localhost:8000/blog/temp/home
	@GetMapping("/temp/home")
	public String tempHome() {
		System.out.println("tempHome()");
		// 파일 리턴 기본 경로: src/main/resources/static
		// 리턴명 : /home.html
		// 풀경로: src/main/resources/static/home.html
		return "/home.html";
	}

	// http://localhost:8000/blog/temp/img
	@GetMapping("/temp/img")
	public String tempImg() {
		System.out.println("tempImg()");
		return "/a.png";
	}
	
	// http://localhost:8000/blog/temp/jsp
	@GetMapping("/temp/jsp")
	public String tempJsp() {
		// prefix: /WEB-INF/views/
	    // suffix: .jsp
		// 풀네임: /WEB-INF/views/test.jsp
		System.out.println("tempJsp()");
		return "test";
	}
}
