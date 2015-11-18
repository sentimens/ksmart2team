package com.specialpos.cost.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.specialpos.cost.domain.SposCost;

@Service
public class SposCostServiceImpl implements SposCostService {

	@Autowired
	SposCostDaoImpl sposCostDaoImpl;
	
	@Override
	public int insertCost(SposCost sposCost) {

		return sposCostDaoImpl.insertCost(sposCost);
	}

	@Override
	public int removeCost(SposCost sposCost) {

		return 0;
	}

	@Override
	public SposCost getUserForModify(String cost_code) {
		return sposCostDaoImpl.getUserForModify(cost_code);
	}

	@Override
	public int modifyCost(SposCost sposCost) {
	
		return 0;
	}

	@Override
	public ArrayList<SposCost> getCostList(String searchWord) {

		return null;
	}

}
