package com.cike.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cike.domain.Cat;
import com.cike.domain.User;
import com.cike.service.UserService;

public class UserServiceImpl implements UserService {

	static Map<User, List<Cat>> catDb = new HashMap<User, List<Cat>>();
	static {
		List<Cat> catList1 = new ArrayList<Cat>();
		catList1.add(new Cat(1, "garfield", "橙色"));
		catList1.add(new Cat(2, "机器猫", "蓝色"));
		catDb.put(new User(1, "sun", "3322", "花果山"), catList1);
		List<Cat> catList2 = new ArrayList<Cat>();
		catList2.add(new Cat(3, "kitty", "白色"));
		catList2.add(new Cat(4, "熊猫", "黑白色"));
		catDb.put(new User(2, "zhu", "5629", "高老庄"), catList2);
	}

	@Override
	public List<Cat> getCatsByUser(User user) {
		return catDb.get(user);
	}

}
