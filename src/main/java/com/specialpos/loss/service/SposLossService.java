package com.specialpos.loss.service;

import java.util.List;

import com.specialpos.loss.domain.SposLoss;

public interface SposLossService {
	public int insertLoss(SposLoss sposLoss);
	public SposLoss getLossForModify(String lossCode);
	public int modifyLoss(String lossCode);
	public int deleteLoss(String lossCode);
	public List<SposLoss> getLossList(String searchWord);
}
