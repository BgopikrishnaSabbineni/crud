package com.rest.crud.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="account", schema = "abconline")
public class Account {
    @Id
    private String ACCOUNT_ID;

    private String ACCOUNT_TYPE;

    public Account() {
        super();
    }

    public Account(String ACCOUNT_ID, String ACCOUNT_TYPE) {
        super();
        this.ACCOUNT_ID = ACCOUNT_ID;
        this.ACCOUNT_TYPE = ACCOUNT_TYPE;
    }

    public String getACCOUNT_ID() {
        return ACCOUNT_ID;
    }

    public void setACCOUNT_ID(String ACCOUNT_ID) {
        this.ACCOUNT_ID = ACCOUNT_ID;
    }

    public String getACCOUNT_TYPE() {
        return ACCOUNT_TYPE;
    }

    public void setACCOUNT_TYPE(String ACCOUNT_TYPE) {
        this.ACCOUNT_TYPE = ACCOUNT_TYPE;
    }
}
