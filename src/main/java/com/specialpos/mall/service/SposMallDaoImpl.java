package com.specialpos.mall.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.specialpos.mall.domain.SposMallDomain;
@Repository
public class SposMallDaoImpl implements SposMallDao {

	@Override
	public int insertMall(SposMallDomain sposMallDomain) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public SposMallDomain getGoodsForModify(String mall_code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int modifyUser(SposMallDomain sposMallDomain) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteUser(SposMallDomain sposMallDomain) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<SposMallDomain> getGoodsList(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

}
