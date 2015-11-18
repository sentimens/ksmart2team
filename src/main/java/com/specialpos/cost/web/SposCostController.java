package com.specialpos.cost.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.specialpos.cost.domain.SposCost;
import com.specialpos.cost.service.SposCostService;

@Controller
public class SposCostController {

	@Autowired
	SposCostService sposCostService;
	@RequestMapping(value="/insertCost", method=RequestMethod.GET)
	public String insertCost(){
		return "/cost/cost_insert";
	}
	@RequestMapping(value="/insertCost", method=RequestMethod.POST)
	public String insertCost(SposCost sposCost){
		if(sposCostService.insertCost(sposCost) !=0){
			return "redirect:/";
		}else{
			return "redirect:/insertCost";
		}
	}
	@RequestMapping(value="/modifyCost", method=RequestMethod.GET)
	public String modifyCost(Model model){
		SposCost sposCost = sposCostService.getUserForModify("price2");
		model.addAttribute("sposCost", sposCost);
		return "/cost/cost_modify";
	}
	
	@RequestMapping(value="/modifyCost", method=RequestMethod.POST)
	public String modifyCost(SposCost sposCost){
		return null;
	}
}
