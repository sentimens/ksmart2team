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
	
	//사원정보 입력폼 이동
	@RequestMapping(value="/insertUserForm", method=RequestMethod.GET)
	public String insertUserForm(){
		return "/user/user_insert";
	}
	
	//사원정보 입력 처리
	@RequestMapping(value="/insertUserService", method=RequestMethod.POST)
	public String insertUser(SposUserDomain sposUserDomain){
		return null;
	}
}
