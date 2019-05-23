package com.riskified.models;

import com.riskified.validations.*;

public class CreditCardPaymentDetails implements IPaymentDetails {
    private String creditCardBin;
    private String avsResultCode;
    private String cvvResultCode;
    private String creditCardNumber;
    private String creditCardCompany;
    private String authorizationId;
    private AuthorizationError authorizationError;
    private String cardholderName;
    private String type;
    private String id;
    private String gateway;
    private String acquirerBin;
    private String mid;

    public CreditCardPaymentDetails(String creditCardBin, String avsResultCode, String cvvResultCode, String creditCardNumber, String creditCardCompany) {
        this.creditCardBin = creditCardBin;
        this.avsResultCode = avsResultCode;
        this.cvvResultCode = cvvResultCode;
        this.creditCardNumber = creditCardNumber;
        this.creditCardCompany = creditCardCompany;
    }

    public void validate(Validation validationType) throws FieldBadFormatException {
        if (validationType == Validation.ALL) {
            Validate.notNullOrEmpty(this, this.creditCardBin, "Credit Card Bin");
            Validate.notNullOrEmpty(this, this.creditCardNumber, "Credit Card Number");
        }
    }

    public String getCreditCardBin() {
        return creditCardBin;
    }

    public void setCreditCardBin(String creditCardBin) {
        this.creditCardBin = creditCardBin;
    }

    public String getAvsResultCode() {
        return avsResultCode;
    }

    public void setAvsResultCode(String avsResultCode) {
        this.avsResultCode = avsResultCode;
    }

    public String getCvvResultCode() {
        return cvvResultCode;
    }

    public void setCvvResultCode(String cvvResultCode) {
        this.cvvResultCode = cvvResultCode;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getCreditCardCompany() {
        return creditCardCompany;
    }

    public void setCreditCardCompany(String creditCardCompany) {
        this.creditCardCompany = creditCardCompany;
    }

    public String getAuthorizationId() {
        return authorizationId;
    }

    public void setAuthorizationId(String authorizationId) {
        this.authorizationId = authorizationId;
    }
    
    public AuthorizationError getAuthorizationError() {
        return authorizationError;
    }

    public void setAuthorizationError(AuthorizationError authorizationError) {
        this.authorizationError = authorizationError;
    }

	public String getCardholderName() {
		return cardholderName;
	}

	public void setCardholderName(String cardholderName) {
		this.cardholderName = cardholderName;
	}

    public String getType() { return type;}

    public void setType(String type) { this.type = type;}

    public String getId() { return id; }

    public void setId(String id) { this.id = id;}

    public String getGateway() { return gateway; }

    public void setGateway(String gateway) { this.gateway = gateway; }

    public String getAcquirerBin() { return acquirerBin; }

    public void setAcquirerBin(String acquirerBin) { this.acquirerBin = acquirerBin; }

    public String getMid() { return mid; }

    public void setMid(String mid) { this.mid = mid; }

}