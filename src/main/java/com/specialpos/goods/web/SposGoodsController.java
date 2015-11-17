package com.specialpos.goods.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.specialpos.goods.domain.SposGoodsDomain;
import com.specialpos.goods.service.SposGoodsService;
//	모든 메서드는 기본 동작만 구현되어 있음. 수정및 구현하여야함.
@Controller
public class SposGoodsController {
	@Autowired
	private SposGoodsService sposGoodsService;

//	Goods 입력폼으로 이동
	@RequestMapping(value="/goods/insertGoodsForm",method=RequestMethod.GET)
	public String insertGoodsForm(){
		return "/goods/goods_insert";
	}
//	Goods 입력데이터 DB에 저장
	@RequestMapping(value="/goods/insertGoodsService",method=RequestMethod.POST)
	public String insertGoodsService(SposGoodsDomain sposGoodsDomain){
		sposGoodsService.insertGoods(sposGoodsDomain);
		return "redirect:/";
	}
	
}
