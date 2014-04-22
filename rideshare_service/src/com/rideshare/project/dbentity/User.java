package com.rideshare.project.dbentity;


public class User {
	enum NotificationPref {
		YES,
		NO
	}
	
	private String userId;
	private String name;
	private String number;
	private NotificationPref notificationPref = User.NotificationPref.NO;
	private String pickUpCount;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public NotificationPref getNotificationPref() {
		return notificationPref;
	}
	public void setNotificationPref(NotificationPref notificationPref) {
		this.notificationPref = notificationPref;
	}
	public String getPickUpCount() {
		return pickUpCount;
	}
	public void setPickUpCount(String pickUpCount) {
		this.pickUpCount = pickUpCount;
	}
}
