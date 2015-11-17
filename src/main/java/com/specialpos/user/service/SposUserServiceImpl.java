package com.specialpos.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.specialpos.user.domain.SposUserDomain;

@Service
public class SposUserServiceImpl implements SposUserService{
@Autowired
	private SposUserDao sposUserDao;

	@Override
	public int insertUser(SposUserDomain sposUserDoamin) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public SposUserDomain getUserForModify(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int modifyUser(String userId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteUser(String userId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<SposUserDomain> getUserList(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
