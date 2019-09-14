package com.foody.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.foody.DriverAllocationEngine;
import com.foody.model.DriverPartner;
import com.foody.model.Order;
import com.foody.model.Restraunt;
import com.foody.model.User;

class AllocateDriverPartnerWithEngineTest {
	private List<DriverPartner> driverPartners = new ArrayList<DriverPartner>();
	private DriverPartner firstDriverPartner;
	private DriverPartner secondDriverPartner;
	private DriverPartner thirdDirverPartner;
	private DriverPartner fourthDirverPartner;
	private Restraunt restraunt;
	private User user;
	private Order order;
	DriverAllocationEngine allocationEngine = new DriverAllocationEngine();

	@BeforeEach
	void setUp() throws Exception {

		firstDriverPartner = new DriverPartner("ID1", "Ram", 10, 20, 5, 4);
		secondDriverPartner = new DriverPartner("ID1", "Ram", 40, 30, 4, 5);
		thirdDirverPartner = new DriverPartner("ID3", "Ram", 30, 10, 6, 6);
		fourthDirverPartner = new DriverPartner("ID4", "Ram", 4, 25, 8, 7);
		driverPartners.add(firstDriverPartner);
		driverPartners.add(secondDriverPartner);
		driverPartners.add(thirdDirverPartner);
		driverPartners.add(fourthDirverPartner);
	}

	@Test
	void testWithtDriverAllocationEngine() {

		restraunt = new Restraunt();
		user = new User();
		order = new Order(user, restraunt, 20);
		order.setOrderId("ODSEP132019-101");
		assertEquals(firstDriverPartner, allocationEngine.getDriverPartner(driverPartners, order));
	}

	@Test
	void test$thDriverforUserRattingWithtDriverAllocationEngine() {

		restraunt = new Restraunt();
		user = new User();
		order = new Order(user, restraunt, 20);
		order.setOrderId("ODSEP132019-101");
		assertEquals(fourthDirverPartner, allocationEngine.getDriverPartnerForReward(driverPartners));
	}

}
