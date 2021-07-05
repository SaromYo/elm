package com.neuedu.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neuedu.entity.User;
import com.neuedu.service.UserService;
/**
 * @author YaoHuiJie
 */
@RestController
public class UserController {

	@Autowired
	private UserService service;
	/**
	 * 用户登录
	 * @param  userTel password
	 * @return user
	 */
	@RequestMapping("/user/signin")
	public User signin(String userTel, String password){
		User user = null;
		Map<String, Object> mapParameter = new HashMap<String, Object>();
		mapParameter.put("userTel", userTel);
		mapParameter.put("password", password);
		List<User> list = service.queryList(mapParameter);
		if (list != null && list.size() > 0) {
			user = list.get(0);
		}
		return user;
	}
	/**
	 * 用户查找
	 * @param  userTel
	 * @return user
	 */
	@RequestMapping("/user/find")
	public User find(String userTel){
		User user = null;
		Map<String, Object> mapParameter = new HashMap<String, Object>();
		mapParameter.put("userTel", userTel);
		List<User> list = service.queryList(mapParameter);
		if (list != null && list.size() > 0) {
			user = list.get(0);
		}
		return user;
	}
	/**
	 * 用户注册
	 * @param  user
	 * @return flag
	 */
	@RequestMapping("/user/signup")
	public String signup(User user) {
		int row = -1;
		row = service.add(user);
		String flag = "Failed";
		if (row > 0) {
			flag = "Success";
		}
		return flag;
	}
	/**
	 * 忘记密码
	 * @param  userTel
	 * @return flag
	 */
	@RequestMapping("/user/forgetpwd")
	public String forgetpwd(User user){
		int row = -1;
		row = service.update(user);
		String flag = "Failed";
		if (row > 0) {
			flag = "Success";
		}
		return flag;
	}
	/**
	 * 用户注销
	 * @param  userNum
	 * @return flag
	 */
	@RequestMapping("/user/writeoff") 
	public String writeoff(String userNum) {
		int row = -1;
		row = service.delete(userNum);
		String flag = "Failed";
		if (row > 0) {
			flag = "Success";
		}
		return flag;
	}
	/**
	 * 修改用户信息
	 * @param  user
	 * @return flag
	 */
	@RequestMapping("/user/modify")
	public String modify(User user) {
		int row = -1;
		row = service.update(user);
		String flag = "Failed";
		if (row > 0) {
			flag = "Success";
		}
		return flag;
	}
}