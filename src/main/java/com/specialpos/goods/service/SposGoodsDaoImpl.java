package com.specialpos.goods.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.specialpos.goods.domain.SposGoods;
@Repository
public class SposGoodsDaoImpl implements SposGoodsDao {

	@Override
	public int insertGoods(SposGoods sposGoodsDomain) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public SposGoods getGoodsForModify(String goods_barcode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int modifyUser(SposGoods sposGoodsDomain) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteUser(SposGoods sposGoodsDomain) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<SposGoods> getGoodsList(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

}
