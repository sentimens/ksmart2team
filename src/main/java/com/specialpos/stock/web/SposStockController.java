package com.specialpos.stock.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.specialpos.stock.domain.SposStock;
import com.specialpos.stock.service.SposStockService;

@Controller
public class SposStockController {

	@Autowired
	private SposStockService sposStockService;
	
	//��� �Է��� �̵�
	@RequestMapping(value="/insertStock", method=RequestMethod.GET)
	public String insertStock(){
		return "/stock/stock_insert";
	}
	
	//��� �Է� ó��
	@RequestMapping(value="/insertStock", method=RequestMethod.POST)
	public String insertStock(SposStock sposStock){
		return null;
	}
	
	//��� ������ �̵�
	@RequestMapping(value="/modifyStock", method=RequestMethod.GET)
	public String modifyStock(){
		return "/stock/stock_modify";
	}
	
	//��� ���� ó��
	@RequestMapping(value="/modifyStock", method=RequestMethod.POST)
	public String modifyStock(SposStock sposStock){
		return null;
	}
	
}
