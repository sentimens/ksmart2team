package com.specialpos.request.domain;

public class SposRequest {
	private String request_code;
	private String user_id;
	private String request_datetime;
	private String request_cate;
	private	String request_content;
	private String request_status;
	
	public String getRequest_code() {
		return request_code;
	}
	public void setRequest_code(String request_code) {
		this.request_code = request_code;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getRequest_datetime() {
		return request_datetime;
	}
	public void setRequest_datetime(String request_datetime) {
		this.request_datetime = request_datetime;
	}
	public String getRequest_cate() {
		return request_cate;
	}
	public void setRequest_cate(String request_cate) {
		this.request_cate = request_cate;
	}
	public String getRequest_content() {
		return request_content;
	}
	public void setRequest_content(String request_content) {
		this.request_content = request_content;
	}
	public String getRequest_status() {
		return request_status;
	}
	public void setRequest_status(String request_status) {
		this.request_status = request_status;
	}
}
