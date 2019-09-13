package com.foody;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.foody.model.DriverPartner;
import com.foody.model.Order;
import com.foody.model.Restraunt;
import com.foody.model.User;

public class AllocateDriverPartner {

	public DriverPartner getDriverPartner(List<DriverPartner> driverPartners) {

		return driverPartners.stream().sorted(Comparator.comparing(DriverPartner::getLocation))
				.collect(Collectors.toList()).get(0);
	}

	public List<DriverPartner> loadDriverPartners() {
		List<DriverPartner> driverPartners = new ArrayList<DriverPartner>();
		driverPartners.add(new DriverPartner("ID1", "Ram", 10, 20, 5));
		driverPartners.add(new DriverPartner("ID2", "Kumar", 22, 25, 7));
		driverPartners.add(new DriverPartner("ID3", "Vivek", 3, 5, 2));
		driverPartners.add(new DriverPartner("ID4", "Senthil", 4, 15, 6));
		return driverPartners;
	}

	public void allocateDriverPartnerWithoutEngine(AllocateDriverPartner allocateDriverPartner) {
		System.out.println("Without Engine");
		List<DriverPartner> driverPartners = allocateDriverPartner.loadDriverPartners();
		Restraunt restraunt = new Restraunt("REST1001", "KrishnaSager");
		User user = new User("USER1001", "Siva");
		Order order = new Order(user, restraunt, 10);
		order.setOrderId("ODSEP132019-101");
		DriverPartner driverPartner = allocateDriverPartner.getDriverPartner(driverPartners);

		order.setDriverPartner(driverPartner);

		System.out.println("OrderID: " + order.getOrderId() + " , Driver PartnerID: " + order.getDriverPartner().getId()
				+ " , Driver Name: " + order.getDriverPartner().getName());

	}

	public void allocateDriverPartnerWitDriverPartnerAllocationEngine(AllocateDriverPartner allocateDriverPartner) {
		System.out.println("With  Engine");

		List<DriverPartner> driverPartners = allocateDriverPartner.loadDriverPartners();
		Restraunt restraunt = new Restraunt("REST1001", "KrishnaSager");
		User user = new User("USER1001", "Siva");
		Order order = new Order(user, restraunt, 10);
		order.setOrderId("ODSEP132019-101");
		DriverAllocationEngine allocationEngine = new DriverAllocationEngine();
		DriverPartner driverPartner = allocationEngine.getDriverPartner(driverPartners, order);

		order.setDriverPartner(driverPartner);
		System.out.println("OrderID: " + order.getOrderId() + " , Driver PartnerID: " + order.getDriverPartner().getId()
				+ " , Driver Name: " + order.getDriverPartner().getName() + " , Driver Total Order: "
				+ order.getDriverPartner().getTotalOrder() + " , Driver TravelTimeToRestraunt : "
				+ order.getDriverPartner().getTravelTimeToRestraunt());

	}

	public static void main(String[] args) {
		AllocateDriverPartner allocateDriverPartner = new AllocateDriverPartner();
		allocateDriverPartner.allocateDriverPartnerWitDriverPartnerAllocationEngine(allocateDriverPartner);
		// allocateDriverPartner.allocateDriverPartnerWithoutEngine(allocateDriverPartner);
	}

}
