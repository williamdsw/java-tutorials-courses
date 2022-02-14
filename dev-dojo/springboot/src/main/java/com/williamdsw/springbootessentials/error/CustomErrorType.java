package com.williamdsw.springbootessentials.error;

/**
 * @author William
 */
public class CustomErrorType {
    private String message;

    public CustomErrorType(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}