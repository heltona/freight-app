package com.helton.freight.services;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import com.helton.freight.models.FreightOrderRequest;
import com.helton.freight.models.FreightOrderResponse;
import com.helton.freight.strategies.FreightStrategy;
import com.helton.freight.strategies.FreightStrategyFactory;

@Service
public class FreightService
{
	public FreightOrderResponse calculateFreight(FreightOrderRequest order)
	{
		FreightStrategy strategy = FreightStrategyFactory.getInstance(new ZipCodeService(order));
		
		float orderValue = strategy.calculateFreightCost(order);
		LocalDate orderDelivery = strategy.calculateFreightDelivery(LocalDate.now());
		
		FreightOrderResponse orderResponse = new FreightOrderResponse();
		orderResponse.setTotalValueFreight(orderValue);
		orderResponse.setForeseeableDeliveryDate(orderDelivery);
		orderResponse.setZipCodeSource(order.getZipCodeSource());
		orderResponse.setZipCodeTarget(order.getZipCodeTarget());		
		
		return orderResponse;
	}
}
