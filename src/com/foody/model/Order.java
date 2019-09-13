package com.foody.model;

public class Order {
	private String orderId;
	private User user;
	private Restraunt restraunt;
	private DriverPartner driverPartner;

	public Order() {
		// TODO Auto-generated constructor stub
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Restraunt getRestraunt() {
		return restraunt;
	}

	public void setRestraunt(Restraunt restraunt) {
		this.restraunt = restraunt;
	}

	public DriverPartner getDriverPartner() {
		return driverPartner;
	}

	public void setDriverPartner(DriverPartner driverPartner) {
		this.driverPartner = driverPartner;
	}

	public Order(User user, Restraunt restraunt) {

		this.user = user;
		this.restraunt = restraunt;

	}

	@Override
	public String toString() {
		return this.orderId + ":" + this.driverPartner.getId() + ":" + this.driverPartner.getName();
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}
