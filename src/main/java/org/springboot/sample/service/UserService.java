package org.springboot.sample.service;

import java.util.List;

import org.springboot.sample.entity.User;
import org.springboot.sample.entity.UserExample;
import org.springboot.sample.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	public User findByName(String name) {
		UserExample example = new UserExample();
		UserExample.Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(name);
		List<User> list = userMapper.selectByExample(example);
		User user = null;
		if (!list.isEmpty()) {
			user = list.get(0);
		}
		return user;
	}
	
	public List<User> findList() {
		UserExample example = new UserExample();
		List<User> list = userMapper.selectByExample(example);
		return list;
	}
}
