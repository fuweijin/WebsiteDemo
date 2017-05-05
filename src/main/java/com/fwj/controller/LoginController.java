package com.fwj.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	@RequestMapping(value="/login")
	public String doLogin(){
		
		return "login";
	}
//	@RequestMapping(value = "/doGetInfo")
//	public String doGetInfo(){
//		return "user/info";
//	}
	
	@RequestMapping(value="/submit")
	public String doSubmit(HttpServletRequest httpServletRequest){
		
		String url = "user/fail";
		
		String username = httpServletRequest.getParameter("username");
		String password = httpServletRequest.getParameter("password");
		
		UsernamePasswordToken token = new UsernamePasswordToken(username, password);
		token.setRememberMe(true);
		
		System.out.println("为了验证登录用户而封装的token为"+ReflectionToStringBuilder.toString(token, ToStringStyle.MULTI_LINE_STYLE));
		//获取当前的Subject
		Subject currentUser = SecurityUtils.getSubject();
		
		try {
			//在调用了login方法后,SecurityManager会收到AuthenticationToken,并将其发送给已配置的Realm执行必须的认证检查  
            //每个Realm都能在必要时对提交的AuthenticationTokens作出反应  
            //所以这一步在调用login(token)方法时,它会走到MyRealm.doGetAuthenticationInfo()方法中,具体验证方式详见此方法
			System.out.println("对用户[" + username + "]进行登录验证..验证开始");  
            currentUser.login(token);  
            System.out.println("对用户[" + username + "]进行登录验证..验证通过");  
            url = "user/success";
//            resultPageURL = "main";  
        }catch(UnknownAccountException uae){  
            System.out.println("对用户[" + username + "]进行登录验证..验证未通过,未知账户");  
            httpServletRequest.setAttribute("message_login", "未知账户");  
        }catch(IncorrectCredentialsException ice){  
            System.out.println("对用户[" + username + "]进行登录验证..验证未通过,错误的凭证");  
            httpServletRequest.setAttribute("message_login", "密码不正确");  
        }catch(LockedAccountException lae){  
            System.out.println("对用户[" + username + "]进行登录验证..验证未通过,账户已锁定");  
            httpServletRequest.setAttribute("message_login", "账户已锁定");  
        }catch(ExcessiveAttemptsException eae){  
            System.out.println("对用户[" + username + "]进行登录验证..验证未通过,错误次数过多");  
            httpServletRequest.setAttribute("message_login", "用户名或密码错误次数过多");  
        }catch(AuthenticationException ae){  
            //通过处理Shiro的运行时AuthenticationException就可以控制用户登录失败或密码错误时的情景  
            System.out.println("对用户[" + username + "]进行登录验证..验证未通过,堆栈轨迹如下");  
            ae.printStackTrace();  
            httpServletRequest.setAttribute("message_login", "用户名或密码不正确");  
        }  
		
		//验证是否登录成功  
        if(currentUser.isAuthenticated()){  
            System.out.println("用户[" + username + "]登录认证通过(这里可以进行一些认证通过后的一些系统参数初始化操作)");  
        }else{  
            token.clear();  
        }
		
		return url;
	}
	
	/**
	 * 用户退出
	 */
	@RequestMapping("/logout")
	public String logout(HttpServletRequest httpServletRequest){
		SecurityUtils.getSubject().logout();
		System.out.println("退出成功！");
		return "user/fail";
	}
	
	/**
	 * 获取用户信息
	 */
	@RequestMapping("/getUserInfo")
	public String getUserInfo(HttpServletRequest httpServletRequest){
		
		String currentUser = (String) httpServletRequest.getSession().getAttribute("currentUser");
		System.out.println("当前登录的用户为[" + currentUser + "]");  
        httpServletRequest.setAttribute("currUser", currentUser); 
        return "user/info";
	}
}
