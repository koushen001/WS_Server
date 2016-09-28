package com.cike.main;

import javax.xml.ws.Endpoint;

import com.cike.cxf.ws.HelloWorld;
import com.cike.cxf.ws.impl.HelloWorldWs;

public class ServerMain {

	public static void main(String[] args) {
		HelloWorld hw = new HelloWorldWs();
		// 调用Endpoint的publish方法发布WebService
		Endpoint.publish("http://10.19.155.102/hello", hw);
		System.out.println("WebService暴露成功！");
	}

}
