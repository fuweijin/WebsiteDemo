package com.tianyue.service.impl;

import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tianyue.mapper.UserMapper;
import com.tianyue.model.User;
import com.tianyue.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	@Resource
	private UserMapper userMapper;

	@Override
	public void createUser(User user) {
		// TODO Auto-generated method stub
		userMapper.createUser(user);
	}
	
	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		userMapper.updateUser(user);
	}
	
	@Override
	public void deleteUser(Long uid) {
		// TODO Auto-generated method stub
		userMapper.deleteUser(uid);
	}
	
	@Override
	public User findByUserName(String userName) {
		// TODO Auto-generated method stub
		return userMapper.findByUserName(userName);
	}
	
	@Override
	public Long findIdByUserName(String userName) {
		// TODO Auto-generated method stub
		return userMapper.findIdByUserName(userName);
	}
	
	@Override
	public Boolean findLockedByUserName(String userName) {
		// TODO Auto-generated method stub
		return userMapper.findLockedByUserName(userName);
	}
	
	@Override
	public User findByUserId(Long userid) {
		// TODO Auto-generated method stub
		return userMapper.findByUserId(userid);
	}
	
	@Override
	public void correlationRoles(Long uid, Long rid) {
		// TODO Auto-generated method stub
		userMapper.correlationRoles(uid, rid);
	}
	
	@Override
	public void unCorrelationRoles(Long uid, Long rid) {
		// TODO Auto-generated method stub
		userMapper.unCorrelationRoles(uid, rid);
	}
	
	@Override
	public Set<String> findRoles(String username) {
		// TODO Auto-generated method stub
		return userMapper.findRoles(username);
	}
	
	@Override
	public Set<String> findPermission(String username) {
		// TODO Auto-generated method stub
		return userMapper.findPermission(username);
	}
}
