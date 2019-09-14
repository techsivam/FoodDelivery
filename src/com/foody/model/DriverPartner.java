package com.foody.model;

import java.util.List;

public class DriverPartner {

	private String id;
	private String name;
	private Integer location;
	private Integer travelTimeToRestraunt;
	private List<Order> pickedOrder;

	private Integer totalOrder;
	/* userRatting will be 1-5 */
	private Integer userRatings;

	public List<Order> getPickedOrder() {
		return pickedOrder;
	}

	public void setPickedOrder(List<Order> pickedOrder) {
		this.pickedOrder = pickedOrder;
	}

	public DriverPartner() {
	}

	public DriverPartner(String id, String name, Integer location, Integer travelTimeToRestraunt, Integer totalOrder,
			Integer userRatings) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.travelTimeToRestraunt = travelTimeToRestraunt;
		this.totalOrder = totalOrder;
		this.userRatings = userRatings;
	}

	public Integer getLocation() {
		return location;
	}

	public void setLocation(Integer location) {
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

	public Integer getTotalOrder() {
		return totalOrder;
	}

	public void setTotalOrder(Integer totalOrder) {
		this.totalOrder = totalOrder;
	}

	public Integer getUserRatings() {
		return userRatings;
	}

	public void setUserRatings(Integer userRatings) {
		this.userRatings = userRatings;
	}

	public Integer getTravelTimeToRestraunt() {
		return travelTimeToRestraunt;
	}

	public void setTravelTimeToRestraunt(Integer travelTimeToRestraunt) {
		this.travelTimeToRestraunt = travelTimeToRestraunt;
	}

	@Override
	public String toString() {
		return "DriverPartner [id=" + id + ", name=" + name + ", totalOrder=" + totalOrder + ", travelTimeToRestraunt="
				+ travelTimeToRestraunt + ", location=" + location + ", userRatings=" + userRatings +  "]";
	}
}
