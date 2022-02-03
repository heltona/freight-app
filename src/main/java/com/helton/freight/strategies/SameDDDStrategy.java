package com.helton.freight.strategies;

public class SameDDDStrategy extends FreightStrategy
{
	private final int foreseeableDeliveryDays = 1;
	private final float discount = 0.5f;
	
	protected int getForeseeableDeliveryDays()
	{
		return foreseeableDeliveryDays;
	}
	protected float getDiscount()
	{
		return discount;
	}
	
	
}
