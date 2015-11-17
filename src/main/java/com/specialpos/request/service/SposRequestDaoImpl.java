package com.specialpos.request.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.specialpos.request.domain.SposRequestDomain;

@Repository
public class SposRequestDaoImpl implements SposRequestDao{

	@Override
	public int insertRequest(SposRequestDomain sposRequestDomain) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public SposRequestDomain getRequestForModify(String requestCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int modifyRequest(SposRequestDomain sposRequestDomain) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteRequest(SposRequestDomain sposRequestDomain) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<SposRequestDomain> getRequestList(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}
}
