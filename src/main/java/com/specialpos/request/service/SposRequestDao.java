package com.specialpos.request.service;

import java.util.List;

import com.specialpos.request.domain.SposRequest;

public interface SposRequestDao {
	public int insertRequest(SposRequest sposRequestDomain);
	public SposRequest getRequestForModify(String requestCode);
	public int modifyRequest(SposRequest sposRequestDomain);
	public int deleteRequest(SposRequest sposRequestDomain);
	public List<SposRequest>getRequestList(String searchWord);
}
