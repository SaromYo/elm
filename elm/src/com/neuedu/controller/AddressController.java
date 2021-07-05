package com.neuedu.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neuedu.entity.Address;
import com.neuedu.service.AddressService;
/**
 * @author YaoHuiJie
 */
@RestController
public class AddressController {

	@Autowired
	private AddressService service;
	/**
	 * 全部地址
	 * @param  userNum
	 * @return list
	 */
	@RequestMapping("/address/all")
	public List<Address> all(String userNum) {
		Map<String, Object> mapParameter = new HashMap<String, Object>();
		mapParameter.put("userNum", userNum);
		List<Address> list = service.queryList(mapParameter);
		if (list != null && list.size() > 0) {
			return list;
		} else {
			return null;
		}
	}
	/**
	 * 添加地址
	 * @param  address
	 * @return flag
	 */
	@RequestMapping("/address/add")
	public String add(Address address) {
		int row = -1;
		row = service.add(address);
		String flag = "Failed";
		if (row > 0) {
			flag = "Success";
		}
		return flag;
	}
	/**
	 * 删除地址
	 * @param  addressNum
	 * @return flag
	 */
	@RequestMapping("/address/delete") 
	public String delete(String addressNum) {
		int row = -1;
		row = service.delete(addressNum);
		String flag = "Failed";
		if (row > 0) {
			flag = "Success";
		}
		return flag;
	}
	/**
	 * 修改地址
	 * @param  address addressNum
	 * @return flag
	 */
	@RequestMapping("/address/modify")
	public String modify(Address address, String addressNum) {
		int row = -1;
		row = service.update(address);
		String flag = "Failed";
		if (row > 0) {
			flag = "Success";
		}
		return flag;
	}
}