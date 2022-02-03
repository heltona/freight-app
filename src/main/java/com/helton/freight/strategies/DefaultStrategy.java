package com.helton.freight.strategies;

public class DefaultStrategy extends FreightStrategy
{
	private final int foreseeableDeliveryDays = 10;
	private final float discount = 0;
	
	protected int getForeseeableDeliveryDays()
	{
		return foreseeableDeliveryDays;
	}
	protected float getDiscount()
	{
		return discount;
	}
	
	
}
