package com.aws.demoaws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/aws")
	public String getString() {
		return "Success";
	}
}
