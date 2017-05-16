package com.tianyue.mapper;

import org.apache.ibatis.annotations.Param;

import com.tianyue.model.Role;

public interface RoleMapper {

	//创建角色
	public void createRole(Role role);
	//根据角色名字查询角色
	public Role findByRoleName(String roleName);
	//关联角色和权限
	public void correlationPermission(@Param("rid")Long rid,@Param("pid")Long pid);
	//取消关联角色和权限
	public void unCorrelationPermission(@Param("rid")Long rid,@Param("pid")Long pid);
	//删除角色前，要先删除角色与权限的关联
//	public void deleteConorrelationPermission(Long rid);
	//根据id删除角色
	public void deleteRole(Long rid);
}
