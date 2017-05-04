package com.fwj.service;

import java.util.List;

import com.fwj.model.User;



public interface UserService {
	
	void save(User user);
	boolean delete(int id);
	boolean update(User user);
	User findById(int id);
	List<User> findAll();

}
