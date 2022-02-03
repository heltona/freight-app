package com.helton.freight.services;

import org.springframework.web.client.RestTemplate;

import com.helton.freight.models.ZipCode;

public class ZipCodeClient
{
	public ZipCode getZipCode(String sZipCode)
	{
		RestTemplate req = new RestTemplate();

		ZipCode zipCode = req.getForObject("https://viacep.com.br/ws/" + sZipCode + "/json", ZipCode.class);

		return zipCode;
	}
}
