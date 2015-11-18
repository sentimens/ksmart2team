package com.specialpos.buy.domain;

public class SposBuy {
	private String buy_code;
	private String mall_code;
	private String goods_barcode;
	private String cost_code;
	private String user_id;
	private int buy_totalcost;
	private String buy_datetime;
	private int buy_reqamount;
	private String buy_status;
	
//	SposBuy Getters and Setters
	public String getBuy_code() {
		return buy_code;
	}
	public void setBuy_code(String buy_code) {
		this.buy_code = buy_code;
	}
	public String getMall_code() {
		return mall_code;
	}
	public void setMall_code(String mall_code) {
		this.mall_code = mall_code;
	}
	public String getGoods_barcode() {
		return goods_barcode;
	}
	public void setGoods_barcode(String goods_barcode) {
		this.goods_barcode = goods_barcode;
	}
	public String getCost_code() {
		return cost_code;
	}
	public void setCost_code(String cost_code) {
		this.cost_code = cost_code;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public int getBuy_totalcost() {
		return buy_totalcost;
	}
	public void setBuy_totalcost(int buy_totalcost) {
		this.buy_totalcost = buy_totalcost;
	}
	public String getBuy_datetime() {
		return buy_datetime;
	}
	public void setBuy_datetime(String buy_datetime) {
		this.buy_datetime = buy_datetime;
	}
	public int getBuy_reqamount() {
		return buy_reqamount;
	}
	public void setBuy_reqamount(int buy_reqamount) {
		this.buy_reqamount = buy_reqamount;
	}
	public String getBuy_status() {
		return buy_status;
	}
	public void setBuy_status(String buy_status) {
		this.buy_status = buy_status;
	}
}
