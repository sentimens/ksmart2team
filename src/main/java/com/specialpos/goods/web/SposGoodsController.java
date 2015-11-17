package com.specialpos.goods.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.specialpos.goods.domain.SposGoodsDomain;
import com.specialpos.goods.service.SposGoodsService;
//	��� �޼���� �⺻ ���۸� �����Ǿ� ����. ������ �����Ͽ�����.
@Controller
public class SposGoodsController {
	@Autowired
	private SposGoodsService sposGoodsService;

//	Goods �Է������� �̵�
	@RequestMapping(value="/goods/insertGoods",method=RequestMethod.GET)
	public String insertGoods(){
		return "/goods/goods_insert";
	}
//	Goods �Էµ����� DB�� ����
	@RequestMapping(value="/goods/insertGoods",method=RequestMethod.POST)
	public String insertGoods(SposGoodsDomain sposGoodsDomain){
		sposGoodsService.insertGoods(sposGoodsDomain);
		return "redirect:/";
	}
	
}
