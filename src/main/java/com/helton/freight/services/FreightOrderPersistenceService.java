package com.helton.freight.services;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.helton.freight.models.FreightOrder;
import com.helton.freight.models.FreightOrderRequest;
import com.helton.freight.models.FreightOrderResponse;
import com.helton.freight.repositories.FreightOrderRepository;

@Service
public class FreightOrderPersistenceService
{
	@Autowired
	private FreightOrderRepository rep;
	
	public FreightOrder saveFreightOrder(FreightOrderRequest req, FreightOrderResponse resp)
	{
		FreightOrder order = new FreightOrder();
		
		order.setForeseeableDeliveryDate(resp.getForeseeableDeliveryDate());
		order.setOrderDate(LocalDate.now());
		order.setRecipientName(req.getRecipientName());
		order.setTotalValueFreight(resp.getTotalValueFreight());
		order.setWeight(req.getWeight());
		order.setZipCodeSource(req.getZipCodeSource());
		order.setZipCodeTarget(req.getZipCodeTarget());
		
		return rep.save(order);
	}
}
