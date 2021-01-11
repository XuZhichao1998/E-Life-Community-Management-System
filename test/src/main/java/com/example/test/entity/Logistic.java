package com.example.test.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;


public class Logistic {
	private int logisticId;
	private String logisticOrderId;
	private Timestamp logisticSubmitDate;
	private String userId;
	private String senderName;
	private int logisticType;
	private String logisticTypeName;
	private String senderPhoneNumber;
	private String senderProvince;
	private String senderCity;
	private String senderDistrict;
	private String senderPostalCode;
	private String senderDetailedAddress;
	private String receiverName;
	private String receiverPhoneNumber;
	private String receiverProvince;
	private String receiverCity;
	private String receiverDistrict;
	private String receiverPostalCode;
	private String receiverDetailedAddress;
	private BigDecimal logisticMoney;
	private Integer courierId;
	private String logisticLastState;
	private Timestamp logisticLastUpdatetime;
	private int logisticFinish;
	public int getLogisticId() {
		return logisticId;
	}
	public void setLogisticId(int logisticId) {
		this.logisticId = logisticId;
	}
	public String getLogisticOrderId() {
		return logisticOrderId;
	}
	public void setLogisticOrderId(String logisticOrderId) {
		this.logisticOrderId = logisticOrderId;
	}
	public Timestamp getLogisticSubmitDate() {
		return logisticSubmitDate;
	}
	public void setLogisticSubmitDate(Timestamp logisticSubmitDate) {
		this.logisticSubmitDate = logisticSubmitDate;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getSenderName() {
		return senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	public int getLogisticType() {
		return logisticType;
	}
	public void setLogisticType(int logisticType) {
		this.logisticType = logisticType;
	}
	public String getLogisticTypeName() {
		return logisticTypeName;
	}
	public void setLogisticTypeName(String logisticTypeName) {
		this.logisticTypeName = logisticTypeName;
	}
	public String getSenderPhoneNumber() {
		return senderPhoneNumber;
	}
	public void setSenderPhoneNumber(String senderPhoneNumber) {
		this.senderPhoneNumber = senderPhoneNumber;
	}
	public String getSenderProvince() {
		return senderProvince;
	}
	public void setSenderProvince(String senderProvince) {
		this.senderProvince = senderProvince;
	}
	public String getSenderCity() {
		return senderCity;
	}
	public void setSenderCity(String senderCity) {
		this.senderCity = senderCity;
	}
	public String getSenderDistrict() {
		return senderDistrict;
	}
	public void setSenderDistrict(String senderDistrict) {
		this.senderDistrict = senderDistrict;
	}
	public String getSenderPostalCode() {
		return senderPostalCode;
	}
	public void setSenderPostalCode(String senderPostalCode) {
		this.senderPostalCode = senderPostalCode;
	}
	public String getSenderDetailedAddress() {
		return senderDetailedAddress;
	}
	public void setSenderDetailedAddress(String senderDetailedAddress) {
		this.senderDetailedAddress = senderDetailedAddress;
	}
	public String getReceiverName() {
		return receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	public String getReceiverPhoneNumber() {
		return receiverPhoneNumber;
	}
	public void setReceiverPhoneNumber(String receiverPhoneNumber) {
		this.receiverPhoneNumber = receiverPhoneNumber;
	}
	public String getReceiverProvince() {
		return receiverProvince;
	}
	public void setReceiverProvince(String receiverProvince) {
		this.receiverProvince = receiverProvince;
	}
	public String getReceiverCity() {
		return receiverCity;
	}
	public void setReceiverCity(String receiverCity) {
		this.receiverCity = receiverCity;
	}
	public String getReceiverDistrict() {
		return receiverDistrict;
	}
	public void setReceiverDistrict(String receiverDistrict) {
		this.receiverDistrict = receiverDistrict;
	}
	public String getReceiverPostalCode() {
		return receiverPostalCode;
	}
	public void setReceiverPostalCode(String receiverPostalCode) {
		this.receiverPostalCode = receiverPostalCode;
	}
	public String getReceiverDetailedAddress() {
		return receiverDetailedAddress;
	}
	public void setReceiverDetailedAddress(String receiverDetailedAddress) {
		this.receiverDetailedAddress = receiverDetailedAddress;
	}
	public BigDecimal getLogisticMoney() {
		return logisticMoney;
	}
	public void setLogisticMoney(BigDecimal logisticMoney) {
		this.logisticMoney = logisticMoney;
	}
	public Integer getCourierId() {
		return courierId;
	}
	public void setCourierId(Integer courierId) {
		this.courierId = courierId;
	}
	public String getLogisticLastState() {
		return logisticLastState;
	}
	public void setLogisticLastState(String logisticLastState) {
		this.logisticLastState = logisticLastState;
	}
	public Timestamp getLogisticLastUpdatetime() {
		return logisticLastUpdatetime;
	}
	public void setLogisticLastUpdatetime(Timestamp logisticLastUpdatetime) {
		this.logisticLastUpdatetime = logisticLastUpdatetime;
	}
	public int getLogisticFinish() {
		return logisticFinish;
	}
	public void setLogisticFinish(int logisticFinish) {
		this.logisticFinish = logisticFinish;
	}
	public Logistic(){}

	public Logistic(int logisticId, String logisticOrderId, Timestamp logisticSubmitDate, String userId, String senderName, int logisticType, String logisticTypeName, String senderPhoneNumber, String senderProvince, String senderCity, String senderDistrict, String senderPostalCode, String senderDetailedAddress, String receiverName, String receiverPhoneNumber, String receiverProvince, String receiverCity, String receiverDistrict, String receiverPostalCode, String receiverDetailedAddress, BigDecimal logisticMoney, Integer courierId, String logisticLastState, Timestamp logisticLastUpdatetime, int logisticFinish) {
		this.logisticId = logisticId;
		this.logisticOrderId = logisticOrderId;
		this.logisticSubmitDate = logisticSubmitDate;
		this.userId = userId;
		this.senderName = senderName;
		this.logisticType = logisticType;
		this.logisticTypeName = logisticTypeName;
		this.senderPhoneNumber = senderPhoneNumber;
		this.senderProvince = senderProvince;
		this.senderCity = senderCity;
		this.senderDistrict = senderDistrict;
		this.senderPostalCode = senderPostalCode;
		this.senderDetailedAddress = senderDetailedAddress;
		this.receiverName = receiverName;
		this.receiverPhoneNumber = receiverPhoneNumber;
		this.receiverProvince = receiverProvince;
		this.receiverCity = receiverCity;
		this.receiverDistrict = receiverDistrict;
		this.receiverPostalCode = receiverPostalCode;
		this.receiverDetailedAddress = receiverDetailedAddress;
		this.logisticMoney = logisticMoney;
		this.courierId = courierId;
		this.logisticLastState = logisticLastState;
		this.logisticLastUpdatetime = logisticLastUpdatetime;
		this.logisticFinish = logisticFinish;
	}

	public void setTypeNameById() {
		switch(logisticFinish) {
			case 1:
				logisticTypeName = "文件票证";
				break;
			case 2:
				logisticTypeName = "数码产品";
				break;
			case 3:
				logisticTypeName = "日用品";
				break;
			case 4:
				logisticTypeName = "生鲜水果";
				break;
			case 5:
				logisticTypeName = "休闲食品";
				break;
			case 6:
				logisticTypeName = "服装鞋帽";
				break;
			case 7:
				logisticTypeName = "工艺品";
				break;
			case 8:
				logisticTypeName = "珠宝首饰";
				break;
			default:
				logisticTypeName = "其它";
				break;
		}
	}
}
