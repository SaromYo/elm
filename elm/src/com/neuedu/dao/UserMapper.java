package com.neuedu.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.neuedu.entity.User;

/**
 * @author YaoHuiJie
 */

@Mapper
public interface UserMapper {
	/**
	 * 查询用户数量
	 * @param  parameter
	 * @return count
	 */
	int queryCount(Map<String, Object> parameter);
	/**
	 * 查询所有
	 * @param  parameter
	 * @return user
	 */
	List<User> queryList(Map<String, Object> parameter);
	/**
	 * 添加用户
	 * @param  parameter
	 * @return nothing
	 */
	int add(User parameter);
	/**
	 * 删除用户
	 * @param  userNum
	 * @return nothing
	 */
	int delete(String userNum);
	/**
	 * 修改用户信息
	 * @param  parameter
	 * @return nothing
	 */
	int update(User parameter);
}