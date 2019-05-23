package com.riskified.models;

public class AuthenticationType {
    private String authType;
    private String exemptionMethod;

    public AuthenticationType(String authType, String exemptionMethod) {
        this.authType = authType;
        this.exemptionMethod = exemptionMethod;
    }

    public String getAuthType() { return authType;}

    public void setAuthType(String authType) { this.authType = authType;}

    public String getExemptionMethod() { return exemptionMethod; }

    public void setExemptionMethod(String exemptionMethod) { this.exemptionMethod = exemptionMethod; }
}
