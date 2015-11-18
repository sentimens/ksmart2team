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
	
	//재고 입력폼 이동
	@RequestMapping(value="/insertStock", method=RequestMethod.GET)
	public String insertStock(){
		return "/stock/stock_insert";
	}
	
	//재고 입력 처리
	@RequestMapping(value="/insertStock", method=RequestMethod.POST)
	public String insertStock(SposStock sposStock){
		return null;
	}
}
