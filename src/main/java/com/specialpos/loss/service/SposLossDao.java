package com.specialpos.loss.service;

import java.util.List;

import com.specialpos.loss.domain.SposLoss;

public interface SposLossDao {
	public int insertLoss(SposLoss sposLoss);
	public SposLoss getLossForModify(String LossCode);
	public int modifyLoss(SposLoss sposLoss);
	public int delteLoss(SposLoss sposLoss);
	public List<SposLoss>getLossList(String serachWord);
}
