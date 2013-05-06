/*
 * @(#)BugController.java 2013-4-11 下午23:33:33
 *
 * Copyright (c) 2011-2013 Makersoft.org all rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 */
package org.makersoft.studio.bugtracker.controllers.issue;

import org.makersoft.web.mvc.RestController;
import org.makersoft.web.mvc.annotation.RESTfull;
import org.springframework.stereotype.Controller;

/**
 * Class description goes here.
 */
@RESTfull
@Controller
public class BugController extends RestController{

	private static final String ROOT_PATH = "/issue/bug";
	
	public String index(){
		
		return ROOT_PATH + "/index";
	}
}
