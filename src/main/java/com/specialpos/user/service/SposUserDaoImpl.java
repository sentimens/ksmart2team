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

//	����� �Ѹ� ���� ���
	@Override
	public int insertUser(SposUser sposUser) {
		return sqlSession.insert(NS+".insertUser", sposUser);
	}

//	����� �Ѹ����� �ҷ�����(�����Ҷ� �Ѹ� ���� ������)
	@Override
	public SposUser getUserForModify(String userId) {
		// TODO Auto-generated method stub
		return null;
	}
	
//	����� ���� ����
	@Override
	public int modifyUser(SposUser sposUser) {
		// TODO Auto-generated method stub
		return 0;
	}

//	����� ���� ����
	@Override
	public int deleteUser(SposUser sposUser) {
		// TODO Auto-generated method stub
		return 0;
	}
	
//	����� ��ü ����Ʈ ��������
	@Override
	public List<SposUser> getUserList(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

}
