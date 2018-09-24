package com.mcf.mybatis.model;

import java.util.Date;

public class Store {
	private String store_uuid;
	private String store_name;
	private String store_url;
	private String store_phone;
	private String store_phone2;
	private String store_phone3;
	private String store_address;
	private Date begin_time;
	private Date end_time;
	public String getStore_uuid() {
		return store_uuid;
	}
	public void setStore_uuid(String store_uuid) {
		this.store_uuid = store_uuid;
	}
	public String getStore_name() {
		return store_name;
	}
	public void setStore_name(String store_name) {
		this.store_name = store_name;
	}
	public String getStore_url() {
		return store_url;
	}
	public void setStore_url(String store_url) {
		this.store_url = store_url;
	}
	public String getStore_phone() {
		return store_phone;
	}
	public void setStore_phone(String store_phone) {
		this.store_phone = store_phone;
	}
	public String getStore_phone2() {
		return store_phone2;
	}
	public void setStore_phone2(String store_phone2) {
		this.store_phone2 = store_phone2;
	}
	public String getStore_phone3() {
		return store_phone3;
	}
	public void setStore_phone3(String store_phone3) {
		this.store_phone3 = store_phone3;
	}
	public String getStore_address() {
		return store_address;
	}
	public void setStore_address(String store_address) {
		this.store_address = store_address;
	}
	public Date getBegin_time() {
		return begin_time;
	}
	public void setBegin_time(Date begin_time) {
		this.begin_time = begin_time;
	}
	public Date getEnd_time() {
		return end_time;
	}
	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}
}
