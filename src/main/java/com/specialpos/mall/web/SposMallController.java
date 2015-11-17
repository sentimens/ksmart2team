package com.specialpos.mall.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.specialpos.mall.domain.SposMallDomain;
import com.specialpos.mall.service.SposMallService;

//��� �޼���� �⺻ ���۸� �����Ǿ� ����. ������ �����Ͽ�����.
@Controller
public class SposMallController {
	
	@Autowired
	private SposMallService sposMallService;
	
//	Mall �Է������� �̵�
	@RequestMapping(value="/mall/insertMall",method=RequestMethod.GET)
	public String insertMall(){
		return "/mall/mall_insert";
	}
//	Mall �Էµ����� DB������
	@RequestMapping(value="/mall/insertMall",method=RequestMethod.POST)
	public String insertMall(SposMallDomain sposMallDomain){
		sposMallService.insertMall(sposMallDomain);
		return "redirect:/";
	}	
}
