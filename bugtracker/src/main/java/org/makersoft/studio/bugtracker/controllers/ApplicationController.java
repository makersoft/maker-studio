/*
 * @(#)ApplicationController.java 2013-4-11 下午23:33:33
 *
 * Copyright (c) 2011-2013 Makersoft.org all rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 */
package org.makersoft.studio.bugtracker.controllers;

import org.makersoft.web.mvc.annotation.RESTfull;
import org.springframework.stereotype.Controller;

/**
 * Class description goes here.
 * 
 * @version 2013-4-11 下午1:46:27
 * @author Feng Kuok
 */
@RESTfull
@Controller
public class ApplicationController {

	public String index(){
		System.out.println("=============================");
		return "index";
	}
}
