package com.specialpos.mall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.specialpos.mall.domain.SposMallDomain;

@Service
public class SposMallServiceImpl implements SposMallService {
	
	@Autowired
	private SposMallDao sposMallDao;
	@Override
	public int insertMall(SposMallDomain sposMallDomain) {
		sposMallDao.insertMall(sposMallDomain);
		return 0;
	}

	@Override
	public SposMallDomain getMallForModify(String mall_code) {
		sposMallDao.getMallForModify(mall_code);
		return null;
	}

	@Override
	public int modifyUser(SposMallDomain sposMallDomain) {
		sposMallDao.modifyUser(sposMallDomain);
		return 0;
	}

	@Override
	public int deleteUser(SposMallDomain sposMallDomain) {
		sposMallDao.deleteUser(sposMallDomain);
		return 0;
	}

	@Override
	public List<SposMallDomain> getMallList(String searchWord) {
		sposMallDao.getMallList(searchWord);
		return null;
	}

}
