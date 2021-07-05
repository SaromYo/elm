package com.neuedu.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neuedu.entity.Merchant;
import com.neuedu.service.MerchantService;
/**
 * @author YaoHuiJie
 */
@RestController
public class MerchantController {

	@Autowired
	private MerchantService service;
	/**
	 * 商家详细信息
	 * @param  merNum
	 * @return merchant
	 */
	@RequestMapping("/merchant/detail")
	public Merchant all(String merNum) {
		Merchant merchant = null;
		Map<String, Object> mapParameter = new HashMap<String, Object>();
		mapParameter.put("merNum", merNum);
		List<Merchant> list = service.queryList(mapParameter);
		if (list != null && list.size() > 0) {
			merchant = list.get(0);
		}
		return merchant;
	}
}