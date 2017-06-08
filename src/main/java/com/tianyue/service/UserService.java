package com.tianyue.service;


import java.util.Set;

import com.tianyue.model.User;

public interface UserService {
	
	//创建用户
	public void createUser(User user);
	
	//修改用户信息
	public void updateUser(User user);
	
	//根据用户id删除用户
	public void deleteUser(Long uid);

	//根据用户名查询
	public User findByUserName(String userName);
	
	//根据用户名查询id
	public Long findIdByUserName(String userName);
	
	//根据用户名查询是否锁定
	public Boolean findLockedByUserName(String userName);
	
	//根据用户id查询
	public User findByUserId(Long userid);
	
	//关联用户和角色
	public void correlationRoles(Long uid,Long rid);
	
	//取消关联用户和角色
	public void unCorrelationRoles(Long uid,Long rid);
	
	//查询该用户的所有角色
	public Set<String> findRoles(String username);
	
	//查询该用户的所有权限
	public Set<String> findPermission(String username);
}
