package com.rest.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user", schema = "abconline")
public class User {
    @Id
    @Column(name="user_ID")
    private String USER_ID;
    @Column(name="user_NAME")
    private String USER_NAME;

    public User() {
        super();
    }

    public User(String USER_ID, String USER_NAME) {
        super();
        this.USER_ID = USER_ID;
        this.USER_NAME = USER_NAME;
    }

    public String getUSER_ID()
    {
        return USER_ID;
    }

    public void setUSER_ID(String USER_ID) {

        this.USER_ID = USER_ID;
    }

    public String getUSER_NAME() {

        return USER_NAME;
    }

    public void setUSER_NAME(String USER_NAME) {
        this.USER_NAME = USER_NAME;
    }
}
