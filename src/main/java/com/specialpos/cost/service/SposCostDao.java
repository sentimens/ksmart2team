package com.specialpos.cost.service;

import java.util.ArrayList;

import com.specialpos.cost.domain.SposCost;

public interface SposCostDao {

	public int insertCost(SposCost sposCost);

	public int removeCost(SposCost sposCost);

	public SposCost getUserForModify(String cost_code);

	public int modifyCost(SposCost sposCost);

	public ArrayList<SposCost> getCostList(String searchWord);
}
