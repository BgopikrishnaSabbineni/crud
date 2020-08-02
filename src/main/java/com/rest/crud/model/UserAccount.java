package com.rest.crud.model;

import javax.persistence.*;
//import javax.validation.constraints.*;

@Entity
@Table(name = "user_account", schema = "abconline")
public class UserAccount {
    @Id
    @Column(name = "User_id")
    private String USER_ID;

    private String ACCOUNT_ID;

    public UserAccount() {
        super();
    }

    public UserAccount(String USER_ID, String ACCOUNT_ID) {
        this.USER_ID = USER_ID;
        this.ACCOUNT_ID = ACCOUNT_ID;
    }

    public String getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(String USER_ID) {
        this.USER_ID = USER_ID;
    }

    public String getACCOUNT_ID() {
        return ACCOUNT_ID;
    }

    public void setACCOUNT_ID(String ACCOUNT_ID) {
        this.ACCOUNT_ID = ACCOUNT_ID;
    }
}
