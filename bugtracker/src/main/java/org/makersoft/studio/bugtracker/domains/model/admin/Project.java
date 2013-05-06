/*
 * @(#)Project.java 2013-4-11 下午23:33:33
 *
 * Copyright (c) 2011-2013 Makersoft.org all rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 */
package org.makersoft.studio.bugtracker.domains.model.admin;

import java.util.List;

/**
 * Class description goes here.
 * 
 * @version 2013-4-11 下午2:46:06
 * @author Feng Kuok
 */
public class Project {
	
//	@CollectionOfElements
//    @JoinTable(
//        table=@Table(name="project_user_list"),
//        joinColumns=@JoinColumn(name="project_id")
//    )
	public List<ProjectUserList> projectUserList;

}
