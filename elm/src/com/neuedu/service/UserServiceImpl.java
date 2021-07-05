package com.neuedu.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.dao.UserMapper;
import com.neuedu.entity.User;

/**
 * @author YaoHuiJie
 */

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper mapper;

	@Override
	public int queryCount(Map<String, Object> parameter) {
		return mapper.queryCount(parameter);
	}

	@Override
	public List<User> queryList(Map<String, Object> parameter) {
		return mapper.queryList(parameter);
	}

	@Override
	public int add(User parameter) {
		return mapper.add(parameter);
	}
	
	@Override
	public int delete(String userNum) {
		return mapper.delete(userNum);
	}
	
	@Override
	public int update(User parameter) {
		return mapper.update(parameter);
	}
}