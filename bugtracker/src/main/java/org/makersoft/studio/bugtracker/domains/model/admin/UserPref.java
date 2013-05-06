/*
 * @(#)UserPref.java 2013-4-11 下午23:33:33
 *
 * Copyright (c) 2011-2013 Makersoft.org all rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 */
package org.makersoft.studio.bugtracker.domains.model.admin;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.makersoft.activerecord.ActiveRecord;

/**
 * 用户管理 
 */
@Entity
@Table(name = "bt_user_pref")
public class UserPref extends ActiveRecord{

	private static final long serialVersionUID = 7354506654141963682L;
		
	public Long id;
	
	public String platform;
	public String os;
	public String osBuild;
	public String description;
	
	@OneToOne(mappedBy = "user_id")
	public User user;
}
