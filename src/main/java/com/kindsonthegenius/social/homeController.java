package com.kindsonthegenius.social;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {
	
	@RequestMapping(value="/home")
	public static String welcome() {
		return "index";
	}

}
