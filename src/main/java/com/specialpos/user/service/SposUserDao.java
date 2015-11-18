package com.specialpos.user.service;

import java.util.List;

import com.specialpos.user.domain.SposUser;

public interface SposUserDao {
	public int insertUser(SposUser sposUserDomain);
	public SposUser getUserForModify(String userId);
	public int modifyUser(SposUser sposUserDomain);
	public int deleteUser(SposUser sposUserDomain);
	public List<SposUser>getUserList(String searchWord);
	
}
