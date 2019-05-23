package com.riskified.models;

public class AuthenticationResult {
    private String createdAt;
    private String resultCode;
    private String resultReasonCode;

    public AuthenticationResult(String createdAt, String resultCode, String resultReasonCode) {
        this.createdAt = createdAt;
        this.resultCode = resultCode;
        this.resultReasonCode = resultReasonCode;
    }

    public String getCreatedAt() { return createdAt; }

    public void setCreatedAt(String createdAt) { this.createdAt = createdAt; }

    public String getResultCode() { return resultCode; }

    public void setResultCode(String resultCode) { this.resultCode = resultCode; }

    public String getResultReasonCode() { return resultReasonCode; }

    public void setResultReasonCode(String resultReasonCode) { this.resultReasonCode = resultReasonCode; }
    

}
