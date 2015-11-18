package com.specialpos.user.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.specialpos.user.domain.SposUser;
import com.specialpos.user.service.SposUserService;

@Controller
public class SposUserController {
	@Autowired
	private SposUserService sposUserService;
	
	//������� �Է��� �̵�
	@RequestMapping(value="/insertUser", method=RequestMethod.GET)
	public String insertUser(){
		return "/user/user_insert";
	}
	
	//������� �Է� ó��
	@RequestMapping(value="/insertUser", method=RequestMethod.POST)
	public String insertUser(SposUser sposUser){
		sposUserService.insertUser(sposUser);
		return "redirect:/";
	}
}
