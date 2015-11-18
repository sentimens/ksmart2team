package com.specialpos.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.specialpos.user.domain.SposUser;

@Service
public class SposUserServiceImpl implements SposUserService{
	@Autowired
		private SposUserDao sposUserDao;

	@Override
	public int insertUser(SposUser sposUserDoamin) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public SposUser getUserForModify(String userId) {
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
	public List<SposUser> getUserList(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
