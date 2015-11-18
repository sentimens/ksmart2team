package com.specialpos.cost.service;

import java.util.ArrayList;

import com.specialpos.cost.domain.SposCost;
import com.specialpos.user.domain.SposUser;

public interface SposCostService {
//	�ܰ��������
	public int insertCost(SposCost sposCost);
//	�ܰ���������
	public int removeCost(SposCost sposCost);
//	1���� �ܰ� ���� �˻�
	public SposUser getUserForModify(String cost_code);
//	�ܰ����� ����
	public int modifyCost(SposCost sposCost);
//	�ܰ����� �˻� Ȥ�� ��ü�ҷ�����
	public ArrayList<SposCost> getCostList(String searchWord);
	
}
