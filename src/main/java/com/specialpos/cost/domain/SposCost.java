package com.specialpos.cost.domain;

public class SposCost {
//	단가관리번호
	private String cost_code;
//	품목바코드번호
	private String goods_barcode;
//	아이디
	private String user_id;
	private int cost_unitcost;
	private int cost_expprice;
	private int cost_saleprice;
	private int cost_salerate;
	private int realprice;
	private String cost_datetime;
	private String cost_note;
	
	
	public String getCost_code() {
		return cost_code;
	}
	public void setCost_code(String cost_code) {
		this.cost_code = cost_code;
	}
	public String getGoods_barcode() {
		return goods_barcode;
	}
	public void setGoods_barcode(String goods_barcode) {
		this.goods_barcode = goods_barcode;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public int getCost_unitcost() {
		return cost_unitcost;
	}
	public void setCost_unitcost(int cost_unitcost) {
		this.cost_unitcost = cost_unitcost;
	}
	public int getCost_expprice() {
		return cost_expprice;
	}
	public void setCost_expprice(int cost_expprice) {
		this.cost_expprice = cost_expprice;
	}
	public int getCost_saleprice() {
		return cost_saleprice;
	}
	public void setCost_saleprice(int cost_saleprice) {
		this.cost_saleprice = cost_saleprice;
	}
	public int getCost_salerate() {
		return cost_salerate;
	}
	public void setCost_salerate(int cost_salerate) {
		this.cost_salerate = cost_salerate;
	}
	public int getRealprice() {
		return realprice;
	}
	public void setRealprice(int realprice) {
		this.realprice = realprice;
	}
	public String getCost_datetime() {
		return cost_datetime;
	}
	public void setCost_datetime(String cost_datetime) {
		this.cost_datetime = cost_datetime;
	}
	public String getCost_note() {
		return cost_note;
	}
	public void setCost_note(String cost_note) {
		this.cost_note = cost_note;
	}
	
	
}
