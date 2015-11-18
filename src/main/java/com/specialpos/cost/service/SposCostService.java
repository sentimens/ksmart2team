package com.specialpos.cost.service;

import java.util.ArrayList;

import com.specialpos.cost.domain.SposCost;
import com.specialpos.user.domain.SposUser;

public interface SposCostService {
//	단가정보등록
	public int insertCost(SposCost sposCost);
//	단가정보삭제
	public int removeCost(SposCost sposCost);
//	1개의 단가 정보 검색
	public SposUser getUserForModify(String cost_code);
//	단가정보 수정
	public int modifyCost(SposCost sposCost);
//	단가정보 검색 혹은 전체불러오기
	public ArrayList<SposCost> getCostList(String searchWord);
	
}
