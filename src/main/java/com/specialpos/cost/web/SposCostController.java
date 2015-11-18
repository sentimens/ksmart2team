package com.specialpos.cost.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.specialpos.cost.domain.SposCost;
import com.specialpos.cost.service.SposCostService;

@Controller
public class SposCostController {

	
	//�ܰ����� �Է��� �̵�
	@RequestMapping(value="/insertCost", method=RequestMethod.GET)
	public String insertCost(){
		return "/cost/cost_insert";
	}
	
	//�ܰ����� �Է� ó��
	@RequestMapping(value="/insertCost", method=RequestMethod.POST)
	public String insertCost(SposCost sposCost){
		return null;
	}
	
	//�ܰ����� ������ �̵�
	@RequestMapping(value="/modifyCost", method=RequestMethod.GET)
	public String modifyCost(){
		return "/cost/cost_modify";
	}
	
	//�ܰ����� ���� ó��
	@RequestMapping(value="/modifyCost", method=RequestMethod.POST)
	public String modifyCost(SposCost sposCost){
		return null;
	}
	
}
