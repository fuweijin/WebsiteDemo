package com.fwj.mapper;

import java.util.List;

import com.fwj.model.User;


public interface UserMapper {

	void save(User user);
	boolean delete(int id);
	boolean update(User user);
	User findById(int id);
	List<User> findAll();
}
