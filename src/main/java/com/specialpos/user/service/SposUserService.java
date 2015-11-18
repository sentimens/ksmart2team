package com.specialpos.user.service;

import java.util.List;

import com.specialpos.user.domain.SposUser;

public interface SposUserService {
	public int insertUser(SposUser sposUserDoamin);
	public SposUser getUserForModify(String userId);
	public int modifyUser(String userId);
	public int deleteUser(String userId);
	public List<SposUser> getUserList(String searchWord);
}
