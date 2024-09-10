package com.coffee.shop.exception;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class ErrorDetail implements Serializable {

    private String errorCode;
    private String errorSummary;
    private List<ErrorCause> errorCauses;

}