package com.tianyue.service;

import org.apache.ibatis.annotations.Param;

import com.tianyue.model.Role;

public interface RoleService {

	public void createRole(Role role);
	public Role findByRoleName(String roleName);
	public void correlationPermission(Long rid,Long pid);
	public void unCorrelationPermission(@Param("rid")Long rid,@Param("pid")Long pid);
//	public void deleteConorrelationPermission(Long rid);
	public void deleteRole(Long rid);
}
