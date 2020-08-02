package com.rest.crud.exception;
public class UserAccountNotFoundException extends Exception {
    private String USER_ID;
    public UserAccountNotFoundException(String USER_ID) {

        super(String.format("Book is not found with id : '%s'", USER_ID));
    }
}