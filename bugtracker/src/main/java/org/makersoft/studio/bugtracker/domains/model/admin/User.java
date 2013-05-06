/*
 * @(#)User.java 2013-4-11 下午23:33:33
 *
 * Copyright (c) 2011-2013 Makersoft.org all rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 */
package org.makersoft.studio.bugtracker.domains.model.admin;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.makersoft.activerecord.ActiveRecord;

/**
 * 用户
 */
@Entity
@Table(name = "bt_user")
public class User extends ActiveRecord{

	private static final long serialVersionUID = -1202887322675141506L;
	
	public Long id;
	
	public String username;
	
	public String realname;
	
	public String email;
	
	public String password;
	
	public Boolean enabled;
	
//	public Integer protected;
	
	public Integer accessLevel;
	
	public Integer loginCount;
	
	public Integer lostPasswordRequestCount;
	
	public Integer failedLoginCount;
	
	public String cookieString;
	
	public Date lastVisit;
	
	public Date createdAt;
	
	public Date updatedAt;
	
	@OneToOne
	public UserPref userPref;
}
