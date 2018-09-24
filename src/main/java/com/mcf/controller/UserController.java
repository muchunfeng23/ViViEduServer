package com.mcf.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mcf.mybatis.mapper.LoginLogMapper;
import com.mcf.mybatis.mapper.StoreMapper;
import com.mcf.mybatis.model.LoginLog;

@RestController
public class UserController {
	private Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private StoreMapper storeMapper;
	@Autowired
	private LoginLogMapper loginLogMapper;
	
	@RequestMapping("applogin")
	public String login(@RequestParam("uuid") String myid){
		//查询数据库中是否存在该店面
		int count = storeMapper.getStoreById(myid);
		if(count <= 0){
			return "notok";
		}
		//插入一条日志
		LoginLog loginLog = new LoginLog();
		loginLog.setStore_uuid(myid);
		loginLogMapper.addLoginLog(loginLog);
		logger.info("uuid = " + myid + " 登录...");
		return "ok";
	}
}
