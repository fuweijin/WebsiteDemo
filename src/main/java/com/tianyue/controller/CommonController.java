package com.tianyue.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tianyue.model.Permission;
import com.tianyue.model.Role;
import com.tianyue.model.User;
import com.tianyue.service.PermissionService;
import com.tianyue.service.RoleService;
import com.tianyue.service.UserService;

@Controller
@RequestMapping(value="/common")
public class CommonController {
	
	@Autowired UserService userService;
	@Autowired RoleService roleService;
	@Autowired PermissionService permissionService;
	
	@RequestMapping(value = "/toRegister")
	public String toRegister(){
		System.out.println("进入注册页面！");
		return "register";
	}

	@RequestMapping(value="/register")
	public String register(HttpServletRequest httpServletRequest){
//		String username = httpServletRequest.getParameter("username");
//		String password = httpServletRequest.getParameter("password");
//		User user = new User(username, password);
//		
//		userService.createUser(user);
//		System.out.println(user);
		
//		Role role = new Role("admin", "超级管理员", Boolean.TRUE);
//		roleService.createRole(role);
//		System.out.println(role);
//		
//		Role role1 = new Role("user", "用户管理员", Boolean.TRUE);
//		roleService.createRole(role1);
//		System.out.println(role1);
		
//		Role role1 = new Role("visiter", "游客", Boolean.TRUE);
//		roleService.createRole(role1);
//		System.out.println(role1);
		
		
//		Permission permission = new Permission("user:create", "用户模块新增", Boolean.TRUE);
//		permissionService.createPermission(permission);
//		System.out.println(permission);
//		
//		Permission permission1 = new Permission("user:update", "用户模块修改", Boolean.TRUE);
//		permissionService.createPermission(permission1);
//		System.out.println(permission1);
//		
//		Permission permission2 = new Permission("user:delete", "用户模块删除", Boolean.TRUE);
//		permissionService.createPermission(permission2);
//		System.out.println(permission2);
//		
//		Permission permission3 = new Permission("user:select", "用户模块查询", Boolean.TRUE);
//		permissionService.createPermission(permission3);
//		System.out.println(permission3);
		
//		userService.correlationRoles(userService.findByUserName(username).getId(), 2l);
//		System.out.println(userService.findByUserName("fwj"));
		
//		System.out.println(roleService.findByRoleName("admin"));
		
//		List<Permission> list = new ArrayList<>();
//		list = (List<Permission>) permissionService.findAllPermission();
//		for(Permission permission : list){
//			System.out.println(permission);
//			roleService.correlationPermission(1l, permission.getId());
//		}
//		
//		roleService.correlationPermission(4l, 1l);
//		roleService.correlationPermission(4l, 2l);
		
//		userService.correlationRoles(1l, 1l);
//		userService.correlationRoles(4l, 4l);
		
//		permissionService.deleteConorrelationRole(3l);
//		permissionService.deletePermission(3l);
		
//		roleService.unCorrelationPermission(2l, 5l);
		
//		roleService.deleteRole(4l);
//		roleService.deleteConorrelationPermission(2l);
		
//		System.out.println(userService.findByUserId(1l));
//		
//		userService.unCorrelationRoles(2l, 2l);
		
//		userService.deleteUser(3l);
		
//		User user = new User();
//		user.setId(4l);
//		user.setUsername("ybb");
//		user.setPassword("123");
//		user.setSalt("ss");
//		
//		userService.updateUser(user);
		
		Set<String> set = new HashSet<>();
//		
//		set = userService.findRoles("fwj");
//		
//		System.out.println("role.size:"+set.size());
//		for(String string : set){
//			System.out.println(string);
//		}
		
		set = userService.findPermission("ybb");
		System.out.println("permission.size:"+set.size());
		for(String string : set){
			System.out.println(string);
		}
		
		return "login";
	}
	
}
