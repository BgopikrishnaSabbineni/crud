package com.rest.crud.exception;
public class AccountBillPayeeNotFoundException extends Exception {
    private String ACC_BILL_PAY_ID;
    public AccountBillPayeeNotFoundException(String ACC_BILL_PAY_ID) {

        super(String.format("Book is not found with id : '%s'", ACC_BILL_PAY_ID));
    }
}