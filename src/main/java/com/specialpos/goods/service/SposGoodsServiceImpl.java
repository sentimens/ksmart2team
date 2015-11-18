package com.specialpos.goods.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.specialpos.goods.domain.SposGoods;


@Service
public class SposGoodsServiceImpl implements SposGoodsService {
	@Autowired
	private SposGoodsDao sposGoodsDao;
	
	@Override
	public int insertGoods(SposGoods sposGoodsDomain) {
		sposGoodsDao.insertGoods(sposGoodsDomain);
		return 0;
	}

	@Override
	public SposGoods getGoodsForModify(String goods_barcode) {
		sposGoodsDao.getGoodsForModify(goods_barcode);
		return null;
	}

	@Override
	public int modifyUser(SposGoods sposGoodsDomain) {
		sposGoodsDao.modifyUser(sposGoodsDomain);
		return 0;
	}

	@Override
	public int deleteUser(SposGoods sposGoodsDomain) {
		sposGoodsDao.deleteUser(sposGoodsDomain);
		return 0;
	}

	@Override
	public List<SposGoods> getGoodsList(String searchWord) {
		sposGoodsDao.getGoodsList(searchWord);
		return null;
	}

}
