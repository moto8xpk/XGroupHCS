package com.webapp.artifact.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/*")
public class MainmenuController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String mainpage() {
		return "index";
	}
}
