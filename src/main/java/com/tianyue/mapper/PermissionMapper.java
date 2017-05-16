package com.tianyue.mapper;

import java.util.List;

import com.tianyue.model.Permission;

public interface PermissionMapper {

	//创建权限
	public void createPermission(Permission permission);
	//删除权限前，要先删除权限与角色的关联
//	public void deleteConorrelationRole(Long pid);
	//根据id删除权限
	public void deletePermission(Long pid);
	//查询所有权限
	public List<Permission> findAllPermission();
}
