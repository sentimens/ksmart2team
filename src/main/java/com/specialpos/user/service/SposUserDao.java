package com.specialpos.user.service;

import java.util.List;

import com.specialpos.user.domain.SposUserDomain;

public interface SposUserDao {
	public int insertUser(SposUserDomain sposUserDomain);
	public SposUserDomain getUserForModify(String userId);
	public int modifyUser(SposUserDomain sposUserDomain);
	public int deleteUser(SposUserDomain sposUserDomain);
	public List<SposUserDomain>getUserList(String searchWord);
	
}
