package com.specialpos.goods.service;

import java.util.List;

import com.specialpos.goods.domain.SposGoods;

public interface SposGoodsDao {
	public int insertGoods(SposGoods sposGoodsDomain);
	public SposGoods getGoodsForModify(String goods_barcode);
	public int modifyUser(SposGoods sposGoodsDomain);
	public int deleteUser(SposGoods sposGoodsDomain);
	public List<SposGoods> getGoodsList(String searchWord);
}
