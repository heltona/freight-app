package com.helton.freight.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.helton.freight.models.FreightOrderRequest;
import com.helton.freight.models.FreightOrderResponse;
import com.helton.freight.models.ApiResponse;

import com.helton.freight.services.FreightOrderPersistenceService;
import com.helton.freight.services.FreightService;


@RestController
public class FreightController
{
	@Autowired
	private FreightService freightService;

	@Autowired
	private FreightOrderPersistenceService persistenceService;

	@RequestMapping(path = "/order", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ApiResponse calculateFreight(@RequestBody FreightOrderRequest order)
	{
		ApiResponse apiResp;
		
		try {
			
			FreightOrderResponse resp = freightService.calculateFreight(order);
			
			persistenceService.saveFreightOrder(order, resp);
			
			apiResp = new ApiResponse(true, resp);

		} catch (Exception ex) {
			
			ex.printStackTrace();
			apiResp = new ApiResponse(false, null);

		}

		return apiResp;
	}

}
