package com.opencbs.core.dto.responses;

/**
 * Created by Makhsut Islamov on 24.10.2016.
 */
public class ErrorResponse {
    private final int httpStatus;
    private final String errorCode;
    private final String message;

    public ErrorResponse(int httpStatus, String errorCode, String message){
        this.httpStatus = httpStatus;
        this.errorCode = errorCode;
        this.message = message;
    }

    public int getHttpStatus() {
        return httpStatus;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getMessage() {
        return message;
    }
}