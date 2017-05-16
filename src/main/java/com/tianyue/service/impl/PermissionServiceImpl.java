package com.tianyue.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tianyue.mapper.PermissionMapper;
import com.tianyue.model.Permission;
import com.tianyue.service.PermissionService;

@Service
@Transactional
public class PermissionServiceImpl implements PermissionService{
	
	@Resource
	private PermissionMapper permissionMapper;

	@Override
	public void createPermission(Permission permission) {
		// TODO Auto-generated method stub
		permissionMapper.createPermission(permission);
	}
	
	@Override
	public List<Permission> findAllPermission() {
		// TODO Auto-generated method stub
		return permissionMapper.findAllPermission();
	}
	
//	@Override
//	public void deleteConorrelationRole(Long pid) {
//		// TODO Auto-generated method stub
//		permissionMapper.deleteConorrelationRole(pid);
//	}
	
	@Override
	public void deletePermission(Long pid) {
		// TODO Auto-generated method stub
		permissionMapper.deletePermission(pid);
	}
}
