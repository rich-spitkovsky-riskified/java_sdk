package com.riskified.models;

import com.riskified.validations.*;


public class CheckoutDeniedOrder extends BaseOrder {

    private AuthorizationError authorizationError;
    private AuthenticationResult authenticationResult;

    public CheckoutDeniedOrder(String id) {
    	this.id = id;
    }


//    Why do we have two CheckoutDeniedFunctions?? Is the one above deprecated? Do we need to add AuthenticationError as a parameter to the below function? 
    public CheckoutDeniedOrder(String id, AuthorizationError authorizationError) {
    	this.id = id;
        this.authorizationError = authorizationError;
    }

    public AuthorizationError getAuthorizationError() {
        return authorizationError;
    }

    public void setAuthorizationError(AuthorizationError authorizationError) {
        this.authorizationError = authorizationError;
    }

    public AuthenticationResult getAuthenticationResult() { return authenticationResult; }

    public void setAuthenticationResult(AuthenticationResult authenticationResult) { this.authenticationResult = authenticationResult; }


    public void validate(Validation validationType) throws FieldBadFormatException {

        if (validationType == Validation.ALL) {
            Validate.notNullOrEmpty(this, this.id, "Id");
        }
        if (this.authorizationError != null) {
            authorizationError.validate(validationType);
        }


    }

}
