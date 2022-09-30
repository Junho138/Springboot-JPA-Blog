package com.example.blog.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


// 사용자가 요청 -> 응답(HTML)
// @Controller

// 사용자가 요청 -> 응답(Data)
@RestController
public class HttpControllerTest {
	private static final String TAG="HttpController Test: ";
	
	@GetMapping("/http/lombok")
	public String lombokTest() {
		Member m = Member.builder().username("ssds").password("121").email("asds@com.com").build();
		System.out.println(TAG + "getter: " + m.getUsername());
		m.setUsername("test");
		System.out.println(TAG + "setter: " + m.getUsername());
		return "lombok test 완료";
	}
	
	// 인터넷 브라우저를 통한 요청은 GET만 가능함
	// http://localhost:8000/blog/http/get (select)
	@GetMapping("/http/get")
	//public String getTest(@RequestParam int id, @RequestParam String username) {
	public String getTest(Member m) {
		return "get 요청: " + m.getId() + ", " + m.getUsername() + ", "+ m.getPassword() +", " + m.getEmail();
	}

	// http://localhost:8000/blog/http/post (insert)
	@PostMapping("/http/post")	// text/plain, application.json
	public String postTest(@RequestBody Member m) {	// MessageConverter(스프링부트)
		return "post 요청: " + m.getId() + ", " + m.getUsername() + ", "+ m.getPassword() +", " + m.getEmail();
//		return "post 요청: " + text;
	}

	// http://localhost:8000/blog/http/put (update)
	@PutMapping("/http/put")
	public String putTest(@RequestBody Member m) {
		return "put 요청: " + m.getId() + ", " + m.getUsername() + ", "+ m.getPassword() +", " + m.getEmail();
	}

	// http://localhost:8000/blog/http/delete (delete)
	@DeleteMapping("/http/delete")
	public String deleteTest(@RequestBody Member m) {
		return "delete 요청: " + m.getId() + ", " + m.getUsername() + ", "+ m.getPassword() +", " + m.getEmail();
	}

}
