package com.specialpos.user.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.specialpos.user.domain.SposUser;

@Repository
public class SposUserDaoImpl implements SposUserDao{
	
	@Override
	public int insertUser(SposUser sposUserDomain) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public SposUser getUserForModify(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int modifyUser(SposUser sposUserDomain) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteUser(SposUser sposUserDomain) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<SposUser> getUserList(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

}
