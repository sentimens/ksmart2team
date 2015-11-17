package com.specialpos.goods.service;

import java.util.List;

import com.specialpos.goods.domain.SposGoodsDomain;

public interface SposGoodsDao {
	public int insertGoods(SposGoodsDomain sposGoodsDomain);
	public SposGoodsDomain getGoodsForModify(String goods_barcode);
	public int modifyUser(SposGoodsDomain sposGoodsDomain);
	public int deleteUser(SposGoodsDomain sposGoodsDomain);
	public List<SposGoodsDomain> getGoodsList(String searchWord);
}
