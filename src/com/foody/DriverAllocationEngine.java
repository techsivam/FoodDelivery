package com.foody;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.foody.model.DriverPartner;
import com.foody.model.Order;

public class DriverAllocationEngine {

	public DriverPartner getDriverPartner(List<DriverPartner> driverPartners, Order order) {
		Integer preparationTime = order.getPreparationTime();
		List<DriverPartner> sortedByTotalOrder = driverPartners.stream()
				.sorted(Comparator.comparing(DriverPartner::getTotalOrder)).collect(Collectors.toList());
		System.out.println("---------sortedByTotalOrder------------- preparationTime:" + preparationTime);
		sortedByTotalOrder.stream().forEach(System.out::println);
		List<DriverPartner> filteredTravelTimeList = sortedByTotalOrder.stream()
				.filter(dp -> dp.getTravelTimeToRestraunt() <= preparationTime).collect(Collectors.toList());
		System.out.println("---------filteredTravelTimeList------------- preparationTime:" + preparationTime);
		filteredTravelTimeList.stream().forEach(System.out::println);
		System.out.println("----------------------");
		// return
		// filteredTravelTimeList.stream().sorted(Comparator.comparing(DriverPartner::getLocation))
		// .collect(Collectors.toList()).get(0);
		return filteredTravelTimeList.get(0);
	}

	public DriverPartner getDriverPartnerForReward(List<DriverPartner> driverPartners) {

		driverPartners.sort(Comparator.comparing(DriverPartner::getUserRatings).reversed());

		driverPartners.stream().forEach(System.out::println);
		System.out.println("----------------------");
		return driverPartners.get(0);

	}

}
