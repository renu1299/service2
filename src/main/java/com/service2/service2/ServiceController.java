package com.service2.service2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/service2")
public class ServiceController {
	public String test1() {
		return "test one method calling";
				
	}
	
 //@GetMapping("/post")
 public String test2() {
	 return" ";

}

}
