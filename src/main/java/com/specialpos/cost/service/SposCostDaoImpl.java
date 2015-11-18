package com.specialpos.cost.service;

import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.specialpos.cost.domain.SposCost;
import com.specialpos.user.domain.SposUser;

@Repository
public class SposCostDaoImpl implements SposCostDao {

//		servlet-context.xml 에 정의된 mybatis설정정보 가져옴.
	
		@Autowired
		private SqlSessionTemplate sqlSession;
//		mapper에 정의된 네임스페이스
		private String NS = "com.specialpos.cost";
		
//		단가정보 디비에 등록
		@Override
		public int insertCost(SposCost sposCost) {
			return sqlSession.insert(NS+".insertCost",sposCost);
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
