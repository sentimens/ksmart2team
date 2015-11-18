package com.specialpos.request.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.specialpos.request.domain.SposRequest;

@Repository
public class SposRequestDaoImpl implements SposRequestDao{

	private final String NS = "com.specialpos.request";
	
    @Autowired  
    private SqlSessionTemplate sqlSession;
	
	@Override
	public int insertRequest(SposRequest sposRequest) {
		return sqlSession.insert(NS+".insertRequest",sposRequest);
	}

	@Override
	public SposRequest getRequestForModify(String requestCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int modifyRequest(SposRequest sposRequest) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteRequest(SposRequest sposRequest) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<SposRequest> getRequestList(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}
}
