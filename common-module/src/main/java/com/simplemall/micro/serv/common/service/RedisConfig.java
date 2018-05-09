package com.simplemall.micro.serv.common.service;

/**
 * 配置信息
 * 
 * @author guooo
 *
 */
public class RedisConfig {

	public static final String REDIS_IP = "127.0.0.1";
	
	public static final String AUTH = "123456";

	public static final int PORT = 6379;

	public static final boolean TEST_ON_BORROW = true;

	public static final boolean TEST_ON_RETURN = true;

	public static final int MAX_ACTIVE = 1024;

	public static final int MAX_IDLE = 200;

	public static final int MAX_WAIT = 1000;
	
	

}
