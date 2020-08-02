package com.rest.crud.model;

import javax.persistence.*;
//import javax.validation.constraints.*;

@Entity
@Table(name = "account_bill_payee", schema = "abconline")
public class AccountBillPayee {
    @Id
    @Column(name = "Acc_bill_pay_id")
    private String ACC_BILL_PAY_ID;

    private String ACCOUNT_ID;
    private String BILL_PAYEE_ID;
    private String ACC_TXN_ID;


    public AccountBillPayee() {
        super();
    }

    public AccountBillPayee(String ACC_BILL_PAY_ID, String ACCOUNT_ID, String BILL_PAYEE_ID, String ACC_TXN_ID) {
        this.ACC_BILL_PAY_ID = ACC_BILL_PAY_ID;
        this.ACCOUNT_ID = ACCOUNT_ID;
        this.BILL_PAYEE_ID = BILL_PAYEE_ID;
        this.ACC_TXN_ID = ACC_TXN_ID;
    }

    public String getACC_BILL_PAY_ID() {
        return ACC_BILL_PAY_ID;
    }

    public void setACC_BILL_PAY_ID(String ACC_BILL_PAY_ID) {
        this.ACC_BILL_PAY_ID = ACC_BILL_PAY_ID;
    }

    public String getACCOUNT_ID() {
        return ACCOUNT_ID;
    }

    public void setACCOUNT_ID(String ACCOUNT_ID) {
        this.ACCOUNT_ID = ACCOUNT_ID;
    }

    public String getBILL_PAYEE_ID() {
        return BILL_PAYEE_ID;
    }

    public void setBILL_PAYEE_ID(String BILL_PAYEE_ID) {
        this.BILL_PAYEE_ID = BILL_PAYEE_ID;
    }

    public String getACC_TXN_ID() {
        return ACC_TXN_ID;
    }

    public void setACC_TXN_ID(String ACC_TXN_ID) {
        this.ACC_TXN_ID = ACC_TXN_ID;
    }
}



