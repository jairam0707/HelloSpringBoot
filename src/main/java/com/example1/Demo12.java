package com.example1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class Demo12 {
	@Controller
	public class DemoController
	{
		@RequestMapping("/test")
		@ResponseBody
	    public String display()
	    {
	    	return "Hello Spring Boot";
	    }
	}
}
