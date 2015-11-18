package com.specialpos.mall.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.specialpos.mall.domain.SposMall;
import com.specialpos.mall.service.SposMallService;

//모든 메서드는 기본 동작만 구현되어 있음. 수정및 구현하여야함.
@Controller
public class SposMallController {
	
	@Autowired
	SposMallService sposMallService;
//	Mall 입력폼으로 이동
	@RequestMapping(value="/mall/insertMall",method=RequestMethod.GET)
	public String insertMall(){
		return "/mall/mall_insert";
	}
//	Mall 입력데이터 DB에저장
	@RequestMapping(value="/mall/insertMall",method=RequestMethod.POST)
	public String insertMall(SposMall sposMallDomain){
		sposMallService.insertMall(sposMallDomain);
		return "redirect:/";
	}	
}
