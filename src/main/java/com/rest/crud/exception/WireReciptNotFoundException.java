package com.rest.crud.exception;
public class WireReciptNotFoundException extends Exception {
    private String WIRE_ID;
    public WireReciptNotFoundException(String WIRE_ID) {

        super(String.format("Book is not found with id : '%s'", WIRE_ID));
    }
}