package com.appestudante.model.Request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderRequest {
	@JsonProperty("order_id")
	private String orderId;
}
