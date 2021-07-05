package com.neuedu.service;

import java.util.List;
import java.util.Map;

import com.neuedu.entity.Merchant;

/**
 * @author YaoHuiJie
 */

public interface MerchantService {
	/**
	 * 查询用户数量
	 * @param  parameter
	 * @return count
	 */
	int queryCount(Map<String, Object> parameter);
	/**
	 * 查询所有
	 * @param  parameter
	 * @return merchant
	 */
	List<Merchant> queryList(Map<String, Object> parameter);
	/**
	 * 添加用户
	 * @param  parameter
	 * @return nothing
	 */
	int add(Merchant parameter);
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
	int update(Merchant parameter);
}
