package com.tianyue.mapper;

import java.util.Set;

import org.apache.ibatis.annotations.Param;

import com.tianyue.model.User;

public interface UserMapper {
	
	public void createUser(User user);
	
	public void updateUser(User user);
	
	public void deleteUser(Long uid);
	
	public User findByUserName(String userName);
	
	public User findByUserId(Long userid);
	
	public void correlationRoles(@Param("uid")Long uid,@Param("rid")Long rid);
	
	public void unCorrelationRoles(@Param("uid")Long uid,@Param("rid")Long rid);
	
	public Set<String> findRoles(String username);
	
	public Set<String> findPermission(String username);
	


}
