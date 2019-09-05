package com.ebuy.domain;

import javax.persistence.*;

@Table(name = "administrator")
public class Administrator {
    private String aname;

    private String apassword;

    /**
     * @return aname
     */
    public String getAname() {
        return aname;
    }

    /**
     * @param aname
     */
    public void setAname(String aname) {
        this.aname = aname;
    }

    /**
     * @return apassword
     */
    public String getApassword() {
        return apassword;
    }

    /**
     * @param apassword
     */
    public void setApassword(String apassword) {
        this.apassword = apassword;
    }
}