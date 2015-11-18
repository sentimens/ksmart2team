package com.specialpos.mall.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.specialpos.mall.domain.SposMall;
@Repository
public class SposMallDaoImpl implements SposMallDao {

	@Override
	public int insertMall(SposMall sposMallDomain) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public SposMall getMallForModify(String mall_code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int modifyUser(SposMall sposMallDomain) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteUser(SposMall sposMallDomain) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<SposMall> getMallList(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

}
