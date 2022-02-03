package com.helton.freight.models;

public class ApiResponse
{
	private boolean success;
	private FreightOrderResponse response;
	
	public ApiResponse(boolean success, FreightOrderResponse resp)
	{
		this.success = success;
		this.response = resp;
	}

	public boolean isSuccess()
	{
		return success;
	}

	public void setSuccess(boolean success)
	{
		this.success = success;
	}

	public FreightOrderResponse getResponse()
	{
		return response;
	}

	public void setResponse(FreightOrderResponse response)
	{
		this.response = response;
	}
	
	
}
