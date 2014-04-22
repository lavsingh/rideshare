package com.rideshare.project.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Userprofile {
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public @ResponseBody void findUser(@RequestBody String abc, HttpServletRequest request) {
		
		System.out.println("first rq is success!!!");
	}
}
