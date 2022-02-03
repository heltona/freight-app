package com.helton.freight.strategies;

import java.time.LocalDate;

import com.helton.freight.models.FreightOrderRequest;

public abstract class FreightStrategy
{

	private final float costForWeight = 1;

	public float calculateFreightCost(FreightOrderRequest order)
	{
		float cost = order.getWeight() * costForWeight;

		// if it was meant that same ddd is half the price and same state 75% of the
		// price, then it would be:
		// return cost * getDiscount();
		return cost - (cost * getDiscount());
	}

	public LocalDate calculateFreightDelivery(LocalDate orderDate)
	{
		return orderDate.plusDays(getForeseeableDeliveryDays());
	}

	protected abstract int getForeseeableDeliveryDays();

	protected abstract float getDiscount();

}
