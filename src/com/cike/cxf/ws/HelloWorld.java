package com.cike.cxf.ws;

import java.util.List;

import javax.jws.WebService;

import com.cike.domain.Cat;
import com.cike.domain.User;

@WebService
public interface HelloWorld {
	String sayHi(String name);
	List<Cat> getCatsByUser(User user);
}
