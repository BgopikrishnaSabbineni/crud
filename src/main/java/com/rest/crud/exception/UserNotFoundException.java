package com.rest.crud.exception;
public class UserNotFoundException extends Exception {
    private String USER_ID;
    public UserNotFoundException(String USER_ID) {

        super(String.format("Book is not found with id : '%s'", USER_ID));
    }
}