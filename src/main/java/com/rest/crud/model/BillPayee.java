package com.rest.crud.model;

import javax.persistence.*;
//import javax.validation.constraints.*;

@Entity
@Table(name = "bill_payee", schema = "abconline")
public class BillPayee {
    @Id
    @Column(name = "bill_payee_id")
    private String BILL_PAYEE_ID;
    private String ACC_BILL_PAYEE_ID;



    public BillPayee() {
        super();
    }

    public BillPayee(String ACC_BILL_PAYEE_ID, String BILL_PAYEE_ID) {
        this.ACC_BILL_PAYEE_ID = ACC_BILL_PAYEE_ID;
        this.BILL_PAYEE_ID = BILL_PAYEE_ID;
    }

    public String getACC_BILL_PAYEE_ID() {
        return ACC_BILL_PAYEE_ID;
    }

    public void setACC_BILL_PAYEE_ID(String ACC_BILL_PAYEE_ID) {
        this.ACC_BILL_PAYEE_ID = ACC_BILL_PAYEE_ID;
    }

    public String getBILL_PAYEE_ID() {
        return BILL_PAYEE_ID;
    }

    public void setBILL_PAYEE_ID(String BILL_PAYEE_ID) {
        this.BILL_PAYEE_ID = BILL_PAYEE_ID;
    }
}