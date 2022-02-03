package com.helton.freight.models;

import java.time.LocalDate;

public class FreightOrderResponse
{
	
	private String zipCodeSource;
	private String zipCodeTarget;
	private float totalValueFreight;
	private LocalDate foreseeableDeliveryDate;
	public String getZipCodeSource()
	{
		return zipCodeSource;
	}
	public void setZipCodeSource(String zipCodeSource)
	{
		this.zipCodeSource = zipCodeSource;
	}
	public String getZipCodeTarget()
	{
		return zipCodeTarget;
	}
	public void setZipCodeTarget(String zipCodeTarget)
	{
		this.zipCodeTarget = zipCodeTarget;
	}
	public float getTotalValueFreight()
	{
		return totalValueFreight;
	}
	public void setTotalValueFreight(float totalValueFreight)
	{
		this.totalValueFreight = totalValueFreight;
	}
	public LocalDate getForeseeableDeliveryDate()
	{
		return foreseeableDeliveryDate;
	}
	public void setForeseeableDeliveryDate(LocalDate foreseeableDeliveryDate)
	{
		this.foreseeableDeliveryDate = foreseeableDeliveryDate;
	}
	
	
}
