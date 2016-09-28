package com.cike.cxf.ws.impl;

import java.util.Date;
import java.util.List;

import javax.jws.WebService;

import com.cike.cxf.ws.HelloWorld;
import com.cike.domain.Cat;
import com.cike.domain.User;

@WebService(endpointInterface="com.cike.cxf.ws.HelloWorld",serviceName="HelloWorldWs")
public class HelloWorldWs implements HelloWorld {

	@Override
	public String sayHi(String name) {
		return name + "，您好" + "，现在时间是：" + new Date();
	}

	@Override
	public List<Cat> getCatsByUser(User user) {
		return null;
	}

}
