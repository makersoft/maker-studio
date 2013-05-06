/*
 * @(#)ProjectUserList.java 2013-4-11 下午23:33:33
 *
 * Copyright (c) 2011-2013 Makersoft.org all rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 */
package org.makersoft.studio.bugtracker.domains.model.admin;


/**
 * http://stackoverflow.com/questions/1153409/can-add-extra-fields-to-manytomany-hibernate-extra-table/1168740#1168740
 */
//@Embeddable
public class ProjectUserList {
	
//	@ManyToOne(fetch=FetchType.LAZY)
//	@JoinColumn(name="project_id")
	public Project project;
	
	public User user;
	
	public Integer accessLevel;
}
