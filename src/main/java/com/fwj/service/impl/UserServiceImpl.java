package com.fwj.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fwj.mapper.UserMapper;
import com.fwj.model.User;
import com.fwj.service.UserService;


@Service
@Transactional //此处不再进行创建SqlSession和提交事务，都已交由spring去管理了。
public class UserServiceImpl implements UserService{

	@Resource
	private UserMapper userMapper;
	
	public void save(User user) {
		// TODO Auto-generated method stub
		userMapper.save(user);
	}

	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return userMapper.delete(id);
	}

	public boolean update(User user) {
		// TODO Auto-generated method stub
		return userMapper.update(user);
	}

	public User findById(int id) {
		// TODO Auto-generated method stub
		User user = userMapper.findById(id);
		return user;
	}

	public List<User> findAll() {
		// TODO Auto-generated method stub
		List<User> list = userMapper.findAll();
		return list;
	}

}
