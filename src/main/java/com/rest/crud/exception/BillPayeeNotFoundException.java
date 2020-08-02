package com.rest.crud.exception;
public class BillPayeeNotFoundException extends Exception {
    private String BILL_PAYEE_ID;
    public BillPayeeNotFoundException(String BILL_PAYEE_ID) {

        super(String.format("Book is not found with id : '%s'", BILL_PAYEE_ID));
    }
}