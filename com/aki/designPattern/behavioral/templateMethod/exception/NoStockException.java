package com.aki.designPattern.behavioral.templateMethod.exception;

public class NoStockException extends RuntimeException {

    public NoStockException(String message) {
        super(message);
    }
}
