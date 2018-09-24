package com.mcf.mybatis.model;

import java.util.Date;

public class LoginLog {
	private long id;
	private String store_uuid;
	private Date login_time;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStore_uuid() {
		return store_uuid;
	}
	public void setStore_uuid(String store_uuid) {
		this.store_uuid = store_uuid;
	}
	public Date getLogin_time() {
		return login_time;
	}
	public void setLogin_time(Date login_time) {
		this.login_time = login_time;
	}
}
