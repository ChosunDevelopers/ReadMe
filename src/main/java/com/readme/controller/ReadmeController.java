package com.readme.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/readme")
public class ReadmeController {
	
	@RequestMapping("/home")
	public String home() {
		return "check";
	}
}
