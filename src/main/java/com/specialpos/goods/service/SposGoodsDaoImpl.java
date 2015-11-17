package com.specialpos.goods.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.specialpos.goods.domain.SposGoodsDomain;
@Repository
public class SposGoodsDaoImpl implements SposGoodsDao {

	@Override
	public int insertGoods(SposGoodsDomain sposGoodsDomain) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public SposGoodsDomain getGoodsForModify(String goods_barcode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int modifyUser(SposGoodsDomain sposGoodsDomain) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteUser(SposGoodsDomain sposGoodsDomain) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<SposGoodsDomain> getGoodsList(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

}
