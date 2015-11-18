package com.specialpos.user.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.specialpos.user.domain.SposUser;

@Repository
public class SposUserDaoImpl implements SposUserDao{
	
	private final String NS = "com.specialpos.request";
    @Autowired 
    private SqlSessionTemplate sqlSession;	

//	사용자 한명 정보 등록
	@Override
	public int insertUser(SposUser sposUser) {
		return sqlSession.insert(NS+".insertUser", sposUser);
	}

//	사용자 한명정보 불러오기(수정할때 한명 정보 가져옴)
	@Override
	public SposUser getUserForModify(String userId) {
		// TODO Auto-generated method stub
		return null;
	}
	
//	사용자 정보 수정
	@Override
	public int modifyUser(SposUser sposUser) {
		// TODO Auto-generated method stub
		return 0;
	}

//	사용자 정보 삭제
	@Override
	public int deleteUser(SposUser sposUser) {
		// TODO Auto-generated method stub
		return 0;
	}
	
//	사용자 전체 리스트 가져오기
	@Override
	public List<SposUser> getUserList(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

}
