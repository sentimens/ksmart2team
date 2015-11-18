package com.specialpos.request.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.specialpos.request.domain.SposRequest;

@Repository
public class SposRequestDaoImpl implements SposRequestDao{

	@Override
	public int insertRequest(SposRequest sposRequestDomain) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public SposRequest getRequestForModify(String requestCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int modifyRequest(SposRequest sposRequestDomain) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteRequest(SposRequest sposRequestDomain) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<SposRequest> getRequestList(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}
}
