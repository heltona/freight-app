package com.helton.freight.models;

public class FreightOrderRequest
{
	private float weight;
	private String zipCodeSource;
	private String zipCodeTarget;
	private String recipientName;
	public float getWeight()
	{
		return weight;
	}
	public void setWeight(float weight)
	{
		this.weight = weight;
	}
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
	public String getRecipientName()
	{
		return recipientName;
	}
	public void setRecipientName(String recipientName)
	{
		this.recipientName = recipientName;
	}

	
	
}
