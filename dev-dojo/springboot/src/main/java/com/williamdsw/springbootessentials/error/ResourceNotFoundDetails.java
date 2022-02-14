package com.williamdsw.springbootessentials.error;

/**
 * @author William
 */
public class ResourceNotFoundDetails extends ErrorDetails {
    public ResourceNotFoundDetails() {
    }

    public ResourceNotFoundDetails(String title, Integer status, String detail, Long timestamp, String message) {
        super(title, status, detail, timestamp, message);
    }
}