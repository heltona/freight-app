package com.helton.freight.models;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FREIGHT_ORDER")
public class FreightOrder
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private float weight;
	private String zipCodeSource;
	private String zipCodeTarget;
	private String recipientName;
	private float totalValueFreight;
	private LocalDate foreseeableDeliveryDate;
	private LocalDate orderDate;
	
	public long getId()
	{
		return id;
	}
	public void setId(long id)
	{
		this.id = id;
	}
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
	public LocalDate getOrderDate()
	{
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate)
	{
		this.orderDate = orderDate;
	}
	
	
	
	
}
