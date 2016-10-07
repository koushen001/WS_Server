package com.cike.service;

import java.util.List;

import com.cike.domain.Cat;
import com.cike.domain.User;

public interface UserService {

	public List<Cat> getCatsByUser(User user);

}
