package com.rest.crud.model;

import javax.persistence.*;
//import javax.validation.constraints.*;

@Entity
@Table(name = "wire_rec", schema = "abconline")
public class WireRecipt {
    @Id
    @Column(name = "Wire_id")
    private String WIRE_ID;
    private String ACCOUNT_ID;
    private String ACC_TXN_ID;


    public WireRecipt() {
        super();
    }

    public WireRecipt(String WIRE_ID, String ACCOUNT_ID, String ACC_TXN_ID) {
        this.WIRE_ID = WIRE_ID;
        this.ACCOUNT_ID = ACCOUNT_ID;
        this.ACC_TXN_ID = ACC_TXN_ID;
    }

    public String getWIRE_ID() {
        return WIRE_ID;
    }

    public void setWIRE_ID(String WIRE_ID) {
        this.WIRE_ID = WIRE_ID;
    }

    public String getACCOUNT_ID() {
        return ACCOUNT_ID;
    }

    public void setACCOUNT_ID(String ACCOUNT_ID) {
        this.ACCOUNT_ID = ACCOUNT_ID;
    }

    public String getACC_TXN_ID() {
        return ACC_TXN_ID;
    }

    public void setACC_TXN_ID(String ACC_TXN_ID) {
        this.ACC_TXN_ID = ACC_TXN_ID;
    }
}
