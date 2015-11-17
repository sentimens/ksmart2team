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
	@RequestMapping(value="/goods/insertGoodsForm",method=RequestMethod.GET)
	public String insertGoodsForm(){
		return "/goods/goods_insert";
	}
//	Goods �Էµ����� DB�� ����
	@RequestMapping(value="/goods/insertGoodsService",method=RequestMethod.POST)
	public String insertGoodsService(SposGoodsDomain sposGoodsDomain){
		sposGoodsService.insertGoods(sposGoodsDomain);
		return "redirect:/";
	}
	
}
