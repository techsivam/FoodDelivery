package com.foody.model;

import java.util.List;

public class DriverPartner  {

	private int location;
	private String name;
	private String id;
	private List<Order> pickedOrder;

	public List<Order> getPickedOrder() {
		return pickedOrder;
	}

	public void setPickedOrder(List<Order> pickedOrder) {
		this.pickedOrder = pickedOrder;
	}

	public DriverPartner() {
	}

	
	public DriverPartner(String id, String name, int location) {
		super();
		this.location = location;
		this.name = name;
		this.id = id;
	}

	public int getLocation() {
		return location;
	}

	public void setLocation(int location) {
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	

}
