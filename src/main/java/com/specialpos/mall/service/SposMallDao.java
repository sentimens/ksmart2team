package com.specialpos.mall.service;

import java.util.List;

import com.specialpos.mall.domain.SposMall;

public interface SposMallDao {
	public int insertMall(SposMall sposMallDomain);
	public SposMall getMallForModify(String mall_code);
	public int modifyUser(SposMall sposMallDomain);
	public int deleteUser(SposMall sposMallDomain);
	public List<SposMall> getMallList(String searchWord);
}
