package com.specialpos.cost.service;

import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.specialpos.cost.domain.SposCost;

@Repository
public class SposCostDaoImpl implements SposCostDao {


	
		@Autowired
		private SqlSessionTemplate sqlSession;

		private String NS = "com.specialpos.cost";

		@Override
		public int insertCost(SposCost sposCost) {
			return sqlSession.insert(NS+".insertCost",sposCost);
		}

		@Override
		public int removeCost(SposCost sposCost) {

			return 0;
		}

		@Override
		public SposCost getUserForModify(String cost_code) {
			return sqlSession.selectOne(NS+".getUserForModify", cost_code);
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
