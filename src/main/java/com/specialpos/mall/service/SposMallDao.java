package com.specialpos.mall.service;

import java.util.List;

import com.specialpos.mall.domain.SposMallDomain;

public interface SposMallDao {
	public int insertMall(SposMallDomain sposMallDomain);
	public SposMallDomain getGoodsForModify(String mall_code);
	public int modifyUser(SposMallDomain sposMallDomain);
	public int deleteUser(SposMallDomain sposMallDomain);
	public List<SposMallDomain> getGoodsList(String searchWord);
}
