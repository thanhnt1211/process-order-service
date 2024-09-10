package com.coffee.shop.orderprocessing.exception;

import com.coffee.shop.exception.ErrorDetail;
import lombok.Getter;

@Getter
public class BadOrderException extends RuntimeException {

    private final ErrorDetail errorDetail;

    public BadOrderException(String message, ErrorDetail errorDetail) {
        super(message);
        this.errorDetail = errorDetail;
    }

    public BadOrderException(String message) {
        super(message);
        this.errorDetail = new ErrorDetail();
    }
}
