package com.helton.freight.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

import com.helton.freight.models.FreightOrderRequest;
import com.helton.freight.models.ZipCode;

public class ZipCodeService
{
	private Map<String, ZipCode> zipCodes = new HashMap<>();
	private ZipCodeClient client = new ZipCodeClient();
	
	public ZipCodeService(FreightOrderRequest order)
	{	
		zipCodes.put("source", client.getZipCode(order.getZipCodeSource()));
		zipCodes.put("target", client.getZipCode(order.getZipCodeTarget()));
	}

	public boolean isSameDDD()
	{
		String source = zipCodes.get("source").getDdd();
		String target = zipCodes.get("target").getDdd();;

		return source.equals(target);
	}

	public boolean isSameState()
	{
		String source = zipCodes.get("source").getUf();
		String target = zipCodes.get("target").getUf();

		return source.equals(target);
	}

}
