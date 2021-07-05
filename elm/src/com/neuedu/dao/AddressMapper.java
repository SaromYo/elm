package com.neuedu.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.neuedu.entity.Address;

/**
 * @author YaoHuiJie
 */

@Mapper
public interface AddressMapper {
	/**
	 * 查询用户数量
	 * @param  parameter
	 * @return count
	 */
	int queryCount(Map<String, Object> parameter);
	/**
	 * 查询所有
	 * @param  parameter
	 * @return address
	 */
	List<Address> queryList(Map<String, Object> parameter);
	/**
	 * 添加用户
	 * @param  parameter
	 * @return nothing
	 */
	int add(Address parameter);
	/**
	 * 删除用户
	 * @param  parameter
	 * @return nothing
	 */
	int delete(String parameter);
	/**
	 * 修改用户信息
	 * @param  parameter
	 * @return nothing
	 */
	int update(Address parameter);
}