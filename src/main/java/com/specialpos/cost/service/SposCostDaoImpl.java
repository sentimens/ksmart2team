package com.specialpos.cost.service;

import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.specialpos.cost.domain.SposCost;
import com.specialpos.user.domain.SposUser;

@Repository
public class SposCostDaoImpl implements SposCostDao {

//		servlet-context.xml �� ���ǵ� mybatis�������� ������.
	
		@Autowired
		private SqlSessionTemplate sqlSession;
//		mapper�� ���ǵ� ���ӽ����̽�
		private String NS = "com.specialpos.cost";
		
//		�ܰ����� ��� ���
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
