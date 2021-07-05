package com.neuedu.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.dao.AddressMapper;
import com.neuedu.entity.Address;

/**
 * @author YaoHuiJie
 */

@Service
public class AddressServiceImpl implements AddressService {
	
	@Autowired
	private AddressMapper mapper;

	@Override
	public int queryCount(Map<String, Object> parameter) {
		return mapper.queryCount(parameter);
	}

	@Override
	public List<Address> queryList(Map<String, Object> parameter) {
		return mapper.queryList(parameter);
	}

	@Override
	public int add(Address parameter) {
		return mapper.add(parameter);
	}
	
	@Override
	public int delete(String parameter) {
		return mapper.delete(parameter);
	}
	
	@Override
	public int update(Address parameter) {
		return mapper.update(parameter);
	}
}