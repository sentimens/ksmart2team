package com.specialpos.user.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.specialpos.user.domain.SposUserDomain;
import com.specialpos.user.service.SposUserService;

@Controller
public class SposUserController {
	@Autowired
	private SposUserService sposUserService;
	
	//������� �Է��� �̵�
	@RequestMapping(value="/insertUserForm", method=RequestMethod.GET)
	public String insertUserForm(){
		return "/user/user_insert";
	}
	
	//������� �Է� ó��
	@RequestMapping(value="/insertUserService", method=RequestMethod.POST)
	public String insertUser(SposUserDomain sposUserDomain){
		return null;
	}
}
