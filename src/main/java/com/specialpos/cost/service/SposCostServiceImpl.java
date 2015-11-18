package com.specialpos.cost.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.specialpos.cost.domain.SposCost;
import com.specialpos.user.domain.SposUser;

@Service
public class SposCostServiceImpl implements SposCostService {

	@Autowired
	SposCostDaoImpl sposCostDaoImpl;
	
	@Override
	public int insertCost(SposCost sposCost) {
//		dao의 insertCost메서드 호출
		return sposCostDaoImpl.insertCost(sposCost);
	}

	@Override
	public int removeCost(SposCost sposCost) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public SposUser getUserForModify(String cost_code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int modifyCost(SposCost sposCost) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<SposCost> getCostList(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

}
