package com.neuedu.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.dao.MerchantMapper;
import com.neuedu.entity.Merchant;

/**
 * @author YaoHuiJie
 */

@Service
public class MerchantServiceImpl implements MerchantService {
	
	@Autowired
	private MerchantMapper mapper;

	@Override
	public int queryCount(Map<String, Object> parameter) {
		return mapper.queryCount(parameter);
	}

	@Override
	public List<Merchant> queryList(Map<String, Object> parameter) {
		return mapper.queryList(parameter);
	}

	@Override
	public int add(Merchant parameter) {
		return mapper.add(parameter);
	}
	
	@Override
	public int delete(String parameter) {
		return mapper.delete(parameter);
	}
	
	@Override
	public int update(Merchant parameter) {
		return mapper.update(parameter);
	}
}