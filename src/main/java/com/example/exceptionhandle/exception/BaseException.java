package com.example.exceptionhandle.exception;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BaseException extends RuntimeException {
    protected String errorCode;
    protected String message;

    protected BaseException(String errorCode, Object... args) {
        this.errorCode = errorCode;
        this.message = "There is error: " + errorCode;
    }
}
