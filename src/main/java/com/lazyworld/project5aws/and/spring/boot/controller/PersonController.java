package com.lazyworld.project5aws.and.spring.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

	@RequestMapping("/getname")
public String getname()
{
	return "Welcome to SpringBoot Project Phase 5";
}
}
