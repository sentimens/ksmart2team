package com.specialpos.request.service;

import java.util.List;

import com.specialpos.request.domain.SposRequest;

public interface SposRequestService {
	public int insertRequest(SposRequest sposRequestDoamin);
	public SposRequest getRequestForModify(String requestCode);
	public int modifyRequest(String requestCode);
	public int deleteRequest(String requestCode);
	public List<SposRequest> getReuqestList(String searchWord);
}
