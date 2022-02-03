package com.helton.freight.strategies;

import com.helton.freight.services.ZipCodeService;

public class FreightStrategyFactory
{
	public static FreightStrategy getInstance(ZipCodeService zipCode)
	{
		if(zipCode.isSameDDD())
			return new SameDDDStrategy();
		
		if(zipCode.isSameState())
			return new SameStateStrategy();
		
		return new DefaultStrategy();
	}
}
