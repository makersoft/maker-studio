/*
 * @(#)Bug.java 2013-4-11 下午23:33:33
 *
 * Copyright (c) 2011-2013 Makersoft.org all rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 */
package org.makersoft.studio.bugtracker.domains.model.issue;

import java.util.List;

import org.makersoft.studio.bugtracker.domains.model.admin.Project;
import org.makersoft.studio.bugtracker.domains.model.admin.User;

/**
 * Class description goes here.
 * 
 * @version 2013-4-11 下午2:44:29
 * @author Feng Kuok
 */
public class Bug {
	
	public Project project;

//	reporter_id
	public User reporter;
	
	public User handler;
	
	public Bug duplicate;	//复制品
	
	public List<User> monitor;
	
	
}
