package com.foody.model;

public class Restraunt {

	String restaruntId;
	String restrauntName;

	public Restraunt() {
		// TODO Auto-generated constructor stub
	}
	public String getRestaruntId() {
		return restaruntId;
	}

	public void setRestaruntId(String restaruntId) {
		this.restaruntId = restaruntId;
	}

	public String getRestrauntName() {
		return restrauntName;
	}

	public void setRestrauntName(String restrauntName) {
		this.restrauntName = restrauntName;
	}

	public Restraunt(String restaruntId, String restrauntName) {
		super();
		this.restaruntId = restaruntId;
		this.restrauntName = restrauntName;
	}

}
