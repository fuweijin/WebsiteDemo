package com.tianyue.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tianyue.mapper.RoleMapper;
import com.tianyue.model.Role;
import com.tianyue.service.RoleService;

@Service
@Transactional
public class RoleServiceImpl implements RoleService{

	@Resource
	private RoleMapper roleMapper;
	
	@Override
	public void createRole(Role role) {
		// TODO Auto-generated method stub
		roleMapper.createRole(role);
	}
	
	@Override
	public Role findByRoleName(String roleName) {
		// TODO Auto-generated method stub
		return roleMapper.findByRoleName(roleName);
	}
	
	@Override
	public void correlationPermission(Long rid, Long pid) {
		// TODO Auto-generated method stub
		roleMapper.correlationPermission(rid, pid);
	}
	
	@Override
	public void unCorrelationPermission(Long rid, Long pid) {
		// TODO Auto-generated method stub
		roleMapper.unCorrelationPermission(rid, pid);
	}
	
//	@Override
//	public void deleteConorrelationPermission(Long rid) {
//		// TODO Auto-generated method stub
//		roleMapper.deleteConorrelationPermission(rid);
//	}
	
	@Override
	public void deleteRole(Long rid) {
		// TODO Auto-generated method stub
		roleMapper.deleteRole(rid);
	}
}
