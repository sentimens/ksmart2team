package com.specialpos.request.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.specialpos.request.domain.SposRequestDomain;
import com.specialpos.request.service.SposRequestService;

@Controller
public class SposRequestController {
	@Autowired
	private SposRequestService sposRequestService;
	
	//�����û���� �Է� �� �̵�
	@RequestMapping(value="/insertRequestForm", method=RequestMethod.GET)
	public String insertRequest(){
		return "/request/request_insert";
	}
	
	//�����û���� �Է�ó��
	@RequestMapping(value="/insertRequestService", method=RequestMethod.POST)
	public String insertRequest(SposRequestDomain sposRequestDomain){
		return null;
	}
}
