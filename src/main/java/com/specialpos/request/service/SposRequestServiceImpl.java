package com.specialpos.request.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.specialpos.request.domain.SposRequestDomain;

@Service
public class SposRequestServiceImpl implements SposRequestService{
	@Autowired
		private SposRequestDao sposRequestDao;
	
	@Override
	public int insertRequest(SposRequestDomain sposRequestDoamin) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public SposRequestDomain getRequestForModify(String requestCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int modifyRequest(String requestCode) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteRequest(String requestCode) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<SposRequestDomain> getReuqestList(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

}
