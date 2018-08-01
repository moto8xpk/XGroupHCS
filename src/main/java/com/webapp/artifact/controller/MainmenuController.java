package com.webapp.artifact.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.webapp.artifact.service.RoleService;
import com.webapp.artifact.service.StaffService;

@Controller
@RequestMapping("/*")
public class MainmenuController {
	
	@Autowired
	private RoleService roleService;
	
	@Autowired
	private StaffService service;
	
	@RequestMapping(value = "/MainPage")
	public ModelAndView mainpage(ModelAndView mv) {
//		mv.addObject("roles",roleService.getAllRoles());
//		mv.setViewName("index");
		mv.addObject("staffs",service.getStaffs());
		mv.setViewName("staff");
		return mv;
	}
}
