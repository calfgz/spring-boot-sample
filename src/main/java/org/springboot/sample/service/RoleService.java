package org.springboot.sample.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springboot.sample.entity.Role;
import org.springboot.sample.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
	
	@Autowired
	private RoleMapper roleMapper;
	
	public List<Role> findListByUserId(int userId) {
		return roleMapper.findListByUserId(userId);
	}
	
	public Set<String> getRolesNameByUser(int userId) {
		List<Role> list = roleMapper.findListByUserId(userId);
		Set<String> set = new HashSet<>();
		for(Role role : list) {
			set.add(role.getRolename());
		}
		return set;
	}
}
