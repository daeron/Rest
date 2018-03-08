package com.projectname.model.apirequest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Orders {
	@JsonProperty("process_id")
	private String processId;
	
	@JsonProperty("order_id")
	private String orderId;
	
	@JsonProperty("prev_process_id")
	private String prevProcessId;
	
	@JsonProperty("billing_id")
	private String billingId;
	
	@JsonProperty("store_code")
	private String storeCode;
	
	@JsonProperty("member_id")
	private String memberId;
	
	@JsonProperty("amount")
	private String amount;
	
	@JsonProperty("currency")
	private String currency;
	
	@JsonProperty("transaction_token")
	private String transactionToken;
	
	@JsonProperty("transaction_token_info")
	private String transactionTokenInfo;
	
	@JsonProperty("collect_level3_data")
	private boolean collectLevel3Data;
	
	@JsonProperty("mobile_device")
	private boolean mobileDevice;
	
	@JsonProperty("app_country")
	private String appCountry;
	
	@JsonProperty("card_exp")
	private String cardExp;
	
	@JsonProperty("is_front_end_delivery_order")
	private boolean isFrontEndDeliveryOrder;
	
	@JsonProperty("token_type")
	private String tokenType;
	
	@JsonProperty("txntype_id")
	private String txntypeId;
	
	@JsonProperty("store_cc_token")
	private boolean storeCcToken;
	
	@JsonProperty("transaction_start_date")
	private String startDate;	
	
	@JsonProperty("form_fields")
	private FormFields formFields;	
	
	@JsonProperty("card_name")
	private String cardName;
	
	@JsonProperty("auth_code")
	private String authCode;
	
	public String getAuthCode() {
		return authCode;
	}

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public FormFields getFormFields() {
		return this.formFields;
	}
	
	public void setFormFields(FormFields formFields) {
		this.formFields = formFields;
	}

	public String getTxntypeId() {
		return this.txntypeId;
	}

	public void setTxntypeId(String txntypeId) {
		this.txntypeId = txntypeId;
	}

	public String getProcessId() {
		return this.processId;
	}

	public void setProcessId(String processId) {
		this.processId = processId;
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getPrevProcessId() {
		return this.prevProcessId;
	}

	public void setPrevProcessId(String prevProcessId) {
		this.prevProcessId = prevProcessId;
	}

	public String getBillingId() {
		return this.billingId;
	}

	public void setBillingId(String billingId) {
		this.billingId = billingId;
	}

	public String getStoreCode() {
		return this.storeCode;
	}

	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public String getMemberId() {
		return this.memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getAmount() {
		return this.amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getTransactionToken() {
		return this.transactionToken;
	}

	public void setTransactionToken(String transactionToken) {
		this.transactionToken = transactionToken;
	}

	public String getTransactionTokenInfo() {
		return this.transactionTokenInfo;
	}

	public void setTransactionTokenInfo(String transactionTokenInfo) {
		this.transactionTokenInfo = transactionTokenInfo;
	}

	public boolean getCollectLevel3Data() {
		return this.collectLevel3Data;
	}

	public void setCollectLevel3Data(boolean collectLevel3Data) {
		this.collectLevel3Data = collectLevel3Data;
	}

	public boolean isMobileDevice() {
		return this.mobileDevice;
	}

	public void setMobileDevice(boolean mobileDevice) {
		this.mobileDevice = mobileDevice;
	}

	public String getAppCountry() {
		return this.appCountry;
	}

	public void setAppCountry(String appCountry) {
		this.appCountry = appCountry;
	}

	public String getCardExp() {
		return this.cardExp;
	}

	public void setCardExp(String cardExp) {
		this.cardExp = cardExp;
	}

	public boolean getIsFrontEndDeliveryOrder() {
		return this.isFrontEndDeliveryOrder;
	}

	public void setIsFrontEndDeliveryOrder(boolean isFrontEndDeliveryOrder) {
		this.isFrontEndDeliveryOrder = isFrontEndDeliveryOrder;
	}

	public String getTokenType() {
		return this.tokenType;
	}

	public void setTokenType(String tokenType) {
		this.tokenType = tokenType;
	}

	public boolean getStoreCcToken() {
		return this.storeCcToken;
	}

	public void setStoreCcToken(boolean storeCcToken) {
		this.storeCcToken = storeCcToken;
	}

	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public void setFrontEndDeliveryOrder(boolean isFrontEndDeliveryOrder) {
		this.isFrontEndDeliveryOrder = isFrontEndDeliveryOrder;
	}

}