package com.riskified.models;

import java.util.*;

import com.riskified.validations.*;

public class FulfillmentDetails implements IValidated {

    private String fulfillmentId;
    private Date createdAt;
    private String status;
    private List<LineItem> lineItems;
    private String trackingCompany;
    private String trackingNumbers;
    private String trackingUrls;
    private String message;
    private String receipt;

    public FulfillmentDetails(String fulfillmentId, Date createdAt, String status) {
        this.fulfillmentId = fulfillmentId;
        this.createdAt = createdAt;
        this.status = status;
        lineItems = new ArrayList<LineItem>();
    }

    public void validate(Validation validationType)
    throws FieldBadFormatException {

        if (validationType == Validation.ALL) {
            Validate.notNullOrEmpty(this, fulfillmentId, "Fulfillment Id");
            Validate.notNull(this, this.createdAt, "Created At");
            Validate.notNullOrEmpty(this, this.status, "Status");
        }

        if (this.lineItems != null) {
            for (LineItem lineItem : this.lineItems) {
                lineItem.validate(validationType);
            }
        }
    }

    public String getFulfillmentId() {
        return fulfillmentId;
    }

    public void setFulfillmentId(String fulfillmentId) {
        this.fulfillmentId = fulfillmentId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public String getTrackingCompany() {
        return trackingCompany;
    }

    public void setTrackingCompany(String trackingCompany) {
        this.trackingCompany = trackingCompany;
    }

    public String getTrackingNumbers() {
        return trackingNumbers;
    }

    public void setTrackingNumbers(String trackingNumbers) {
        this.trackingNumbers = trackingNumbers;
    }

    public String getTrackingUrls() {
		return trackingUrls;
	}

	public void setTrackingUrls(String trackingUrls) {
		this.trackingUrls = trackingUrls;
	}

	public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getReceipt() {
        return receipt;
    }

    public void setReceipt(String receipt) {
        this.receipt = receipt;
    }


}
