package com.specialpos.user.service;

import java.util.List;

import com.specialpos.user.domain.SposUserDomain;

public interface SposUserService {
	public int insertUser(SposUserDomain sposUserDoamin);
	public SposUserDomain getUserForModify(String userId);
	public int modifyUser(String userId);
	public int deleteUser(String userId);
	public List<SposUserDomain> getUserList(String searchWord);
}
