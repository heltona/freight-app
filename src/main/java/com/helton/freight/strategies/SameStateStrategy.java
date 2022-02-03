package com.helton.freight.strategies;

public class SameStateStrategy extends FreightStrategy
{
	private final int foreseeableDeliveryDays = 3;
	private final float discount = 0.75f;
	
	protected int getForeseeableDeliveryDays()
	{
		return foreseeableDeliveryDays;
	}
	protected float getDiscount()
	{
		return discount;
	}
	
	
}
