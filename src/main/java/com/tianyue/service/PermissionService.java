package com.tianyue.service;

import java.util.List;

import com.tianyue.model.Permission;

public interface PermissionService {

	public void createPermission(Permission permission);

	public List<Permission> findAllPermission();

//	public void deleteConorrelationRole(Long pid);

	public void deletePermission(Long pid);
}
