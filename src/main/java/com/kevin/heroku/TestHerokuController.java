package com.kevin.heroku;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestHerokuController {
	@RequestMapping("/welcome")
	public String welcome() {
		return "Xin chao trung, test Heroku!!!";
	}
}
