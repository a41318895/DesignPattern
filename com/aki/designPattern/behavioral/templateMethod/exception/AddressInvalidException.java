package com.aki.designPattern.behavioral.templateMethod.exception;

public class AddressInvalidException extends RuntimeException{

    public AddressInvalidException(String message) {
        super(message);
    }
}
