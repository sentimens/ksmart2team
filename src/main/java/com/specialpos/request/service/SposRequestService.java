package com.specialpos.request.service;

import java.util.List;

import com.specialpos.request.domain.SposRequestDomain;

public interface SposRequestService {
	public int insertRequest(SposRequestDomain sposRequestDoamin);
	public SposRequestDomain getRequestForModify(String requestCode);
	public int modifyRequest(String requestCode);
	public int deleteRequest(String requestCode);
	public List<SposRequestDomain> getReuqestList(String searchWord);
}
