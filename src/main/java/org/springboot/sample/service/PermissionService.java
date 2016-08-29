package org.springboot.sample.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springboot.sample.entity.Permission;
import org.springboot.sample.entity.PermissionExample;
import org.springboot.sample.mapper.PermissionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PermissionService {
	
	@Autowired
	private PermissionMapper permissionMapper;
	
	public List<Permission> findListByRoleId(int roleId) {
		PermissionExample example = new PermissionExample();
		PermissionExample.Criteria criteria = example.createCriteria();
		criteria.andRoleIdEqualTo(roleId);
		return permissionMapper.selectByExample(example);
	}
	
	public Set<String> getPermissionNamesByRoleId(int roleId) {
		List<Permission> list = this.findListByRoleId(roleId);
		Set<String> set = new HashSet<>();
		for(Permission sion : list) {
			set.add(sion.getPermissionname());
		}
		return set;
	}

}
