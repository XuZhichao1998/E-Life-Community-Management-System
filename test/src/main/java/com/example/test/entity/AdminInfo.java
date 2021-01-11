package com.example.test.entity;


public class AdminInfo {
	private String adminName; //管理员登录名
	private String adminPassword; //管理员登录密码
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	public String showMsg() {
		return "adminName:["+adminName+"], pwd:["+adminPassword+"]";
	}
	
}
