package com.rest.crud.exception;
public class AccountTransactionNotFoundException extends Exception {
    private String ACC_TXN_ID;
    public AccountTransactionNotFoundException(String ACC_TXN_ID) {

        super(String.format("Book is not found with id : '%s'", ACC_TXN_ID));
    }
}