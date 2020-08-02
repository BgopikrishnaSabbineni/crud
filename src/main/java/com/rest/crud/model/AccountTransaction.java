package com.rest.crud.model;

import javax.persistence.*;
//import javax.validation.constraints.*;

@Entity
@Table(name = "account_txn", schema = "abconline")
public class AccountTransaction {
    @Id
    @Column(name = "Acc_Txn_Id")
    private String ACC_TXN_ID;

    private String WIRE_ID;
    private String ACC_BILL_PAYEE_ID;



    public AccountTransaction() {
        super();
    }

    public AccountTransaction(String ACC_TXN_ID, String WIRE_ID, String ACC_BILL_PAYEE_ID) {

        this.ACC_TXN_ID = ACC_TXN_ID;
        this.WIRE_ID = WIRE_ID;
        this.ACC_BILL_PAYEE_ID = ACC_BILL_PAYEE_ID;
    }

    public String getACC_TXN_ID() {
        return ACC_TXN_ID;
    }

    public void setACC_TXN_ID(String ACC_TXN_ID) {
        this.ACC_TXN_ID = ACC_TXN_ID;
    }

    public String getWIRE_ID()
    {
        return WIRE_ID;
    }

    public void setWIRE_ID(String WIRE_ID)
    {
        this.WIRE_ID = WIRE_ID;
    }

    public String getACC_BILL_PAYEE_ID() {

        return ACC_BILL_PAYEE_ID;
    }

    public void setACC_BILL_PAYEE_ID(String ACC_BILL_PAYEE_ID) {

        this.ACC_BILL_PAYEE_ID = ACC_BILL_PAYEE_ID;
    }
}
