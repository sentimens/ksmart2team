package com.specialpos.request.service;

import java.util.List;

import com.specialpos.request.domain.SposRequestDomain;

public interface SposRequestDao {
	public int insertRequest(SposRequestDomain sposRequestDomain);
	public SposRequestDomain getRequestForModify(String requestCode);
	public int modifyRequest(SposRequestDomain sposRequestDomain);
	public int deleteRequest(SposRequestDomain sposRequestDomain);
	public List<SposRequestDomain>getRequestList(String searchWord);
}
