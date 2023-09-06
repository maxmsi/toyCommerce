package com.babik.pet.toyCommerce.api;
import java.time.LocalDateTime;

import lombok.Getter;

@Getter
public class ApiResponse {
    private final boolean success;
    private final String message;

    public ApiResponse(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public String getTimestamp() {
        return LocalDateTime.now().toString();
    }
}