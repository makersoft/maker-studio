/*
 * @(#)SessionController.java 2013-4-16 下午23:33:33
 *
 * Copyright (c) 2011-2013 Makersoft.org all rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 */
package org.makersoft.studio.bugtracker.controllers;

import org.makersoft.web.mvc.RestController;
import org.makersoft.web.mvc.annotation.RESTfull;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Class description goes here.
 */
@RESTfull
@Controller
public class SessionController extends RestController{

	public String create(){
		
		return "redirect:/";
	}
	
	@RequestMapping(value = "/login")
	public String login(){
		return "/session/login";
	}
	
	@RequestMapping(value = "/forgot-password")
	public String forgotPassword(){
		
		return "/session/forget_password";
	}
}
